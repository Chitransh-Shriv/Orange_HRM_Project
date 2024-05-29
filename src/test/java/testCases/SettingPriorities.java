package testCases;

import org.testng.annotations.Test;

public class SettingPriorities {
	
	@Test(priority = 1)
	public void diverInitialize()
	{
		System.out.println("Code to initialize the driver/browser.....");
	}
	
	@Test(priority = 2)
	public void enterURL()
	{
		System.out.println("Code to enter/ launch the url......");
	
	}
	
	@Test(priority = 3)
	public void enterCredentials()
	{
		System.out.println("Code to enter username and password......");
	
	}
	
	@Test(priority = 4)
	public void driverClosing()
	{
		System.out.println("Code to close the browser......");
	
	}
	

}
