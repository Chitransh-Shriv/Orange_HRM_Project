package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PersonalDetailsPageObject {
	
public WebDriver driver;
	
	private By personalDetails= By.xpath("//a[text()='Personal Details']");
	private By firstName = By.name("firstName");
	private By middleName = By.name("middleName");
	private By lastName = By.name("lastName");
	
	public PersonalDetailsPageObject(WebDriver driver2) {
		this.driver = driver2;
	}

	public WebElement personalDetails()
	{
		return driver.findElement(personalDetails);
	}
	
	public WebElement firstName()
	{
		return driver.findElement(firstName);
	}
	
	public WebElement middleName()
	{
		return driver.findElement(middleName);
	}
	
	public WebElement lastName()
	{
		return driver.findElement(lastName);
	}



}
