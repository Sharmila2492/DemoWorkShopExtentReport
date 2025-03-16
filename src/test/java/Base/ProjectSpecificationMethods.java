package Base;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Utils.Utility;

public class ProjectSpecificationMethods extends Utility {
	
	@BeforeSuite
	public void reportInitialization()
	{
		//To create report in the given location
		ExtentSparkReporter reporter= new ExtentSparkReporter("D:\\JavaWorkspace\\TestNG.DemoWorkShop.ExtentReport\\reports\\DemoWebShopreport.html");
		reporter.config().setReportName("Demo Web Shop Report");
		
		//to capture the test data
		extent=new ExtentReports();
		extent.attachReporter(reporter);//it will attach all the details
				
	}
	
	@BeforeClass
	public void testDetails()
	{
		test= extent.createTest(testName, testDescription);
		test.assignCategory(testCategory);
		test.assignAuthor(testAuthor);
	}
	
	@Parameters({"url","browser"})// here parameters are used for cross browser test
	@BeforeMethod
	public void LaunchingAndLoading(String url, String browser)// same order is mentioning here as parameter
	{
		Browser(url,browser);
	}
	
	
	@AfterMethod
	public void closebrowser()
	{
		closeBrowser();
	}
	
	@DataProvider(name="readData")// it is used for test the same test method multiple times with different data inputs
	public String[][] readData() throws Exception 
	{
		String[][] data= readExcel(SheetName);
		return data;
	}
	
	@AfterSuite
	public void reportClose()
	{
		extent.flush();  //mandatory to close the report
	}

}



