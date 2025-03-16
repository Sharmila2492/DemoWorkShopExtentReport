package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.ProjectSpecificationMethods;



public class RegisterPage extends ProjectSpecificationMethods {
	
	public RegisterPage(WebDriver driver1)
	{
		this.driver1=driver1;
	}
	
	
	public RegisterPage clickGender()
	{
		driver1.findElement(By.id("gender-female")).click();
		return this;
	}
	
	public RegisterPage enterFirstName(String Fname)
	{
		driver1.findElement(By.id("FirstName")).sendKeys(Fname);
		return this;
	}
	
	public RegisterPage enterLastName(String Lname)
	{
		driver1.findElement(By.id("LastName")).sendKeys(Lname);
		return this;
	}
	
	public RegisterPage enterEmail(String email)
	{
		driver1.findElement(By.id("Email")).sendKeys(email);
		return this;
	}
	
	public RegisterPage enterPass(String pass)
	{
		driver1.findElement(By.id("Password")).sendKeys(pass);
		return this;
	}
	
	public RegisterPage enterConPass(String conPass)
	{
		driver1.findElement(By.id("ConfirmPassword")).sendKeys(conPass);
	    return this;
	}
	
	public RegisterResult clickRegisterButton()
	{
		driver1.findElement(By.id("register-button")).click();
		return new RegisterResult(driver1);
		
	}
	

}
