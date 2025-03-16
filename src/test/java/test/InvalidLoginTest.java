package test;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.ProjectSpecificationMethods;
import Page.HomePage;

public class InvalidLoginTest extends ProjectSpecificationMethods{

	@BeforeTest
		public void setUp() throws IOException
		{
	    filepath1="D:\\JavaWorkspace\\TestNG.DemoWorkShop.ExtentReport\\src\\test\\resources\\data\\Loginfile.properties";
		readFromPropFile(filepath1);
		}
		
		@Test
		public  void InvalidLoginTest() throws IOException {// change the main method for TestNg
		//public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
			
	      
	       HomePage obj1=new HomePage(driver1);
			
			//obj1.LaunchingAndLoading(prop.getProperty("url"));
			
			obj1.clickLogin()   
			     .enterEmail(prop.getProperty("InEmail"))
			     .enterPass(prop.getProperty("InPass"))
			    .clickLoginButton1()
			    .validLogin(prop.getProperty("TestType"), prop.getProperty("ExpectedResult"));
			    
			     //.closebrowser();
		
		}


	}


