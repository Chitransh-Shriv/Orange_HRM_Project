package resources;

import java.io.IOException;

import org.testng.Assert;

import pageObjectModel.LoginPageObjects;

public class LoginNow extends BaseClass{
	
	public void loginNow() throws InterruptedException, IOException
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
		
	}
}
	
