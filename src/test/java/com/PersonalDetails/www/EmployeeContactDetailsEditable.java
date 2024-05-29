package com.PersonalDetails.www;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjectModel.LoginPageObjects;
import pageObjectModel.PersonalDetailsPageObject;
import resources.BaseClass;

public class EmployeeContactDetailsEditable extends BaseClass {

	@Test

	public void verifyFieldsEditable() throws InterruptedException, IOException {
		driverInitialize();

		Thread.sleep(2000);

		LoginPageObjects lpo = new LoginPageObjects(driver);

		lpo.enterUsername().sendKeys("Admin");
		Thread.sleep(2000);

		lpo.enterPassword().sendKeys("admin123");
		Thread.sleep(2000);

		lpo.clickLoginButton().click();
		Thread.sleep(2000);

		lpo.clickMyInfo().click();
		Thread.sleep(2000);

		PersonalDetailsPageObject pds = new PersonalDetailsPageObject(driver);

		pds.personalDetails().click();
		Thread.sleep(2000);

		// to verify first name field is editable or not
		Assert.assertTrue(pds.firstName().isEnabled());
		System.out.println("first name field is editable");
		Thread.sleep(2000);

		Actions act = new Actions(driver);

		// to enter the text in first name.
		pds.firstName().click();
		Thread.sleep(2000);
//		pds.firstName().sendKeys(Keys.CLEAR);
//		Thread.sleep(2000);

		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.DELETE).build().perform();
		Thread.sleep(2000);

		pds.firstName().sendKeys("Chitranshu");
		Thread.sleep(2000);

		// to enter the text in middle name.
		pds.middleName().click();
		Thread.sleep(2000);

		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.DELETE).build().perform();
		Thread.sleep(2000);

		pds.middleName().sendKeys("Chitranshu");
		Thread.sleep(2000);

		// to enter the text in last name.
		pds.lastName().click();
		Thread.sleep(2000);

		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.DELETE).build().perform();
		Thread.sleep(2000);

		pds.lastName().sendKeys("Shrivastava");
		Thread.sleep(2000);

	}

}
