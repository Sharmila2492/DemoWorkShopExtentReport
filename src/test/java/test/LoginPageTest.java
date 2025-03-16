package test;

import java.io.IOException;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.ProjectSpecificationMethods;
import Page.HomePage;

public class LoginPageTest extends ProjectSpecificationMethods{

	@BeforeTest
	public void setUp() throws IOException
	{
    filepath1="D:\\JavaWorkspace\\TestNG.DemoWorkShop.ExtentReport\\src\\test\\resources\\data\\Loginfile.properties";
	readFromPropFile(filepath1);
	testName="Login Test";
	testDescription="Testing the login functionality with positive and negative casea";
	testAuthor="Sharmila";
	testCategory="SmokeTesting";
	}
	
	@Test
	public  void LoginTest() throws IOException {// change the main method for TestNg
	//public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
      
       HomePage obj1=new HomePage(driver1);
		
		//obj1.LaunchingAndLoading(prop.getProperty("url"));
		
		obj1.clickLogin()   
		     .enterEmail(prop.getProperty("Email"))
		     .enterPass(prop.getProperty("Pass"))
		    .clickLoginButton1()
		     .validLogin(prop.getProperty("TestType"), prop.getProperty("ExpectedResult"));
		    System.out.println(prop.getProperty("TestType"));
		    System.out.println(prop.getProperty("ExpectedResult"));
		     //.closebrowser();
	
	}


}
