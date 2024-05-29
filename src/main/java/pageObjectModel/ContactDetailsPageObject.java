package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactDetailsPageObject {
	
	public WebDriver driver;
	
	private By contactDetails = By.xpath("//a[text()='Contact Details']");
	private By street1 = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
	private By street2 = By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]");
	private By city = By.xpath("(//input[@class='oxd-input oxd-input--active'])[4]");
	private By state = By.xpath("(//input[@class='oxd-input oxd-input--active'])[5]");
	private By postalCode = By.xpath("(//input[@class='oxd-input oxd-input--active'])[6]");
	private By email1 = By.xpath("(//input[@class='oxd-input oxd-input--active'])[10]");
	private By countryDrop = By.xpath("//div[@class='oxd-select-text-input']");
	private By userName = By.xpath("//p[@class='oxd-userdropdown-name']");
	private By logOut = By.xpath("//a[text()='Logout']");
	
	
	public ContactDetailsPageObject(WebDriver driver2)
	{
		this.driver = driver2;
	}

	public WebElement contactDetails()
	{
		return driver.findElement(contactDetails);
	}
	
	public WebElement street1()
	{
		return driver.findElement(street1);
	}
	
	public WebElement street2()
	{
		return driver.findElement(street2);
	}
	
	public WebElement city()
	{
		return driver.findElement(city);
	}
	
	public WebElement state()
	{
		return driver.findElement(state);
	}
	
	public WebElement postalCode()
	{
		return driver.findElement(postalCode);
	}
	
	public WebElement email1()
	{
		return driver.findElement(email1);
	}
	
	public WebElement countryDrop()
	{
		return driver.findElement(countryDrop);
	}
	
	public WebElement userName()
	{
		return driver.findElement(userName);
	}
	
	public WebElement logOut()
	{
		return driver.findElement(logOut);
	}
	

}