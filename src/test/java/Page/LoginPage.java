package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.ProjectSpecificationMethods;



public class LoginPage extends ProjectSpecificationMethods {
	
	public LoginPage(WebDriver driver1)
	{
		this.driver1=driver1;
	
	}
	
	public LoginPage enterEmail(String email)
	{
		driver1.findElement(By.id("Email")).sendKeys(email);
	    return this;
	}
    
	public LoginPage enterPass(String pass)
	{
		driver1.findElement(By.className("password")).sendKeys(pass);
	    return this;
	}
	
	public HomePage clickLoginButton1()
	{
		driver1.findElement(By.xpath("//input[contains(@class,'button-1 login-button')]")).click();
		return new HomePage(driver1);
	}
	
	
}
