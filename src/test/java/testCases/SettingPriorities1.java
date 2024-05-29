package testCases;

import org.testng.annotations.Test;

public class SettingPriorities1 {

	
	@Test(priority = 'a')
	public void diverInitialize()
	{
		System.out.println("Code to initialize the driver/browser.....");
	}
	
	@Test(priority = 'b')
	public void enterURL()
	{
		System.out.println("Code to enter/ launch the url......");
	
	}
	
	@Test(priority = 'A')
	public void enterCredentials()
	{
		System.out.println("Code to enter username and password......");
	
	}
	
	@Test(priority = 'z')
	public void driverClosing()
	{
		System.out.println("Code to close the browser......");
	
	}
}
