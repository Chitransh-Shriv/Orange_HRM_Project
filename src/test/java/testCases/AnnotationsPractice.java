package testCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsPractice {
	
	@Test
	public void m1()
	{
		System.out.println("I am method m1......");
	}
	
	@Test
	public void z1()
	{
		System.out.println("I am method z1.......");		
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("This method will be excuted before each and every @Test annoted method.....");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("This method will be executed after each and every @Test annoted method.....");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("This method will be executed before the first test method in a class is invoked......");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("This method will be executed after all the test methods in a class have been run......");
	}

}
