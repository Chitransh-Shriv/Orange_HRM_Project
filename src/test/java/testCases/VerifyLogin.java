package testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjectModel.LoginPageObjects;
import resources.BaseClass;

public class VerifyLogin extends BaseClass{


	@Test
	public void verifyLoginButton() throws InterruptedException, IOException
	{
		driverInitialize();
		
		Thread.sleep(2000);
		
		LoginPageObjects lpo = new LoginPageObjects(driver);
		
		lpo.enterUsername().sendKeys("Admin");
		Thread.sleep(2000);
		
		lpo.enterPassword().sendKeys("admin123");
		Thread.sleep(2000);
		
		lpo.clickLoginButton().click();
		Thread.sleep(2000);
		
		// apply assertion
		
		String titleExpected = "OrangeHRM";
		String titleActual = driver.getTitle();
		Assert.assertEquals(titleActual, titleExpected);
		System.out.println("You have successfully login.");
		
//		WebElement title = driver.findElement(By.xpath("//h6[text()='Dashboard']"));
//		Thread.sleep(2000);
//		Assert.assertTrue(title.isDisplayed());
//		System.out.println("You have successfully login.");
		
		
		
	}

}
