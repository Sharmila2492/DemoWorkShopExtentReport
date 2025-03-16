package Utils;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

import Base.ProjectSpecificationMethods;

public class ListenerClass extends ProjectSpecificationMethods implements ITestListener{

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		test.log(Status.PASS, "TestPassed");
		String Screenshotpath=null;
		try {
			 Screenshotpath= screenshot(result.getMethod().getMethodName()+"pass");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		test.addScreenCaptureFromPath(Screenshotpath, result.getMethod().getMethodName()+"fail");
	
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		test.fail(result.getThrowable()); //capture the exception from the result
		String Screenshotpath=null;
		try {
			 Screenshotpath= screenshot(result.getMethod().getMethodName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		test.addScreenCaptureFromPath(Screenshotpath, result.getMethod().getMethodName());
	}

	 
	
	 
}
