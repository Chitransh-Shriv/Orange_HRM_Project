package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {
	
	public WebDriver driver;
	
	private By username= By.name("username");
	private By password= By.name("password");
	private By loginButton= By.xpath("//button[@type='submit']");
	private By contactInfo = By.xpath("(//a[@class='oxd-main-menu-item'])[6]");
	
	public LoginPageObjects(WebDriver driver2)
	{
		this.driver=driver2;
	}

	public WebElement enterUsername()
	{
		return driver.findElement(username);
	}
	
	public WebElement enterPassword()
	{
		return driver.findElement(password);
	}
	
	public WebElement clickLoginButton()
	{
		return driver.findElement(loginButton);
	}
	
	public WebElement clickMyInfo()
	{
		return driver.findElement(contactInfo);
	}
	
	
	

}
