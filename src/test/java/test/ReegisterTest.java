package test;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.ProjectSpecificationMethods;
import Page.HomePage;


public class ReegisterTest extends ProjectSpecificationMethods {
	
	
	@BeforeTest
	
	public void setUp() throws IOException
	{
		 filepath1="D:\\JavaWorkspace\\TestNG.DemoWorkShop.ExtentReport\\src\\test\\resources\\data\\Loginfile.properties";
			readFromPropFile(filepath1);
		SheetName="RegisterData";
		
	}

@Test(dataProvider = "readData")//Mandatory for the test to execute
	
	public  void RegisterTest(String FirstName, String LastName, String email, String pass, String conPass ) throws IOException  {
	
	

			
		HomePage Reg=new HomePage(driver1);
			
         	
		 Reg.clickRegister()
		    .clickGender()
		    .enterFirstName(FirstName)
		    .enterLastName(LastName)
		    .enterEmail(email)
		    .enterPass(pass)
		    .enterConPass(conPass)
		    .clickRegisterButton();
		    //.validateRegisterResult1()
		   // .clickContinue();
		    //.closebrowser();
		    
	}
	
	}


