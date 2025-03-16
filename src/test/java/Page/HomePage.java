package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import Base.ProjectSpecificationMethods;


public class HomePage extends ProjectSpecificationMethods{
	
	public HomePage(WebDriver driver1)
	{
		this.driver1=driver1;
		PageFactory.initElements(driver1, this);
	}
	@FindBy(xpath ="(//a[@class='account'])[1]")
	WebElement validLoginText;
	
	@FindBy(xpath="//span[@for='Email']")
	WebElement invalidLoginText;
    
	
	 public RegisterPage clickRegister()
	    {
	    	driver1.findElement(By.className("ico-register")).click();
	    	
	    	return new RegisterPage(driver1);
	    }
		
	 public LoginPage clickLogin()
		{
			//clicklogin.click();
			driver1.findElement(By.className("ico-login")).click();
			
			return new LoginPage(driver1);
		}
		
	
		 public HomePage validLogin(String TestType, String ExpectedResult) {
				
				if(TestType.equalsIgnoreCase("ValidEmailValidPassword")){
					
					String ActualText=validLoginText.getText();
					//Hard Assertion
					Assert.assertEquals(ActualText, ExpectedResult);
				} else if(TestType.equalsIgnoreCase("InValidEmailValidPassword")){
					
					String ActualText=invalidLoginText.getText();
					// Soft Assertion
					SoftAssert asserObj = new SoftAssert();
					asserObj.assertEquals(ActualText, ExpectedResult);
					asserObj.assertAll();
				}
				return this;
			
		}
}



	 


