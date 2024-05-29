package testCases;

import org.testng.annotations.Test;

public class SettingPrioritiesEnable {
	
	@Test(enabled = false)
	public void diverInitialize()
	{
		System.out.println("Code to initialize the driver/browser.....");
	}
	
	@Test(enabled = true)
	public void enterURL()
	{
		System.out.println("Code to enter/ launch the url......");
	
	}
	
	@Test(priority = 1)
	public void enterCredentials()
	{
		System.out.println("Code to enter username and password......");
	
	}
	
	@Test(priority = 2)
	public void driverClosing()
	{
		System.out.println("Code to close the browser......");
	
	}

}
