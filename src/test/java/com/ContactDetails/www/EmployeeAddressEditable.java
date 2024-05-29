package com.ContactDetails.www;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pageObjectModel.ContactDetailsPageObject;
import pageObjectModel.LoginPageObjects;
import resources.BaseClass;
import resources.LoginNow;
import testCases.VerifyLogin;

public class EmployeeAddressEditable extends LoginNow {

	public String assertValue() throws UnsupportedFlavorException, IOException, InterruptedException {
		Actions act = new Actions(driver);
		// ctrl+a
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();

		// ctrl+c
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(2000);

		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();

		return (String) clipboard.getData(DataFlavor.stringFlavor);

	}

	@Test
	public void verifyAddressEditable() throws InterruptedException, IOException, UnsupportedFlavorException {

		loginNow();
		Thread.sleep(2000);

		LoginPageObjects lpo = new LoginPageObjects(driver);

		lpo.clickMyInfo().click();
		Thread.sleep(2000);

		ContactDetailsPageObject cds = new ContactDetailsPageObject(driver);

		cds.contactDetails().click();
		Thread.sleep(2000);

		// To verify that Street 1 text box is editable.
		Assert.assertTrue(cds.street1().isEnabled());
		System.out.println("Street 1 text box is editable.");
		// Thread.sleep(2000);

		// To verify that Street 1 is accepting combination of alphabets, numbers and
		// special characters.
//		cds.street1().click();
//		Thread.sleep(2000);
		cds.street1().sendKeys(Keys.chord(Keys.CONTROL, "a"), "#2- University Road");
		Thread.sleep(2000);

		// Assertion
		String actualValS1 = assertValue();
		String expectValS1 = "#2- University Road";
		Assert.assertEquals(actualValS1, expectValS1);
		System.out.println("Verified successfully for street 1");

		// To verify that Street 2 text box is editable.
		Assert.assertTrue(cds.street2().isEnabled());
		System.out.println("Street 2 text box is editable.");
		Thread.sleep(3000);

		// To verify that Street 2 is accepting combination of alphabets, numbers and
		// special characters.
		cds.street2().click();
		// Thread.sleep(2000);
		cds.street2().sendKeys(Keys.chord(Keys.CONTROL, "a"), "F123-Govindpuri");
		Thread.sleep(2000);

		// Assertion
		String actualValS2 = assertValue();
		String expectValS2 = "F123-Govindpuri";
		Assert.assertEquals(actualValS2, expectValS2);
		System.out.println("Verified successfully for street 2");

		// To verify that City text box is editable.
		Assert.assertTrue(cds.city().isEnabled());
		System.out.println("City text box is editable.");
		Thread.sleep(3000);

		// To verify that City is accepting combination of alphabets, numbers and
		// special characters.
		cds.city().click();
		Thread.sleep(2000);
		cds.city().sendKeys(Keys.chord(Keys.CONTROL, "a"), "Gwalior");
		Thread.sleep(2000);

		// Assertion
		String actualValCity = assertValue();
		String expectValCity = "Gwalior";
		Assert.assertEquals(actualValCity, expectValCity);
		System.out.println("Verified successfully for city");

		// To verify that State/Province text box is editable.
		Assert.assertTrue(cds.state().isEnabled());
		System.out.println("State/Province text box is editable.");
		Thread.sleep(3000);

		// To verify that State/Province is accepting combination of alphabets, numbers
		// and
		// special characters.
		cds.state().click();
		Thread.sleep(2000);
		cds.state().sendKeys(Keys.chord(Keys.CONTROL, "a"), "Madhya Pradesh");
		Thread.sleep(2000);

		// Assertion
		String actualValState = assertValue();
		String expectValState = "Madhya Pradesh";
		Assert.assertEquals(actualValState, expectValState);
		System.out.println("Verified successfully for state");

		// To verify that Zip/Postal Code text box is editable.
		Assert.assertTrue(cds.postalCode().isEnabled());
		System.out.println("Zip/Postal Code text box is editable.");
		Thread.sleep(3000);

		// To verify that Zip/Postal Code is accepting combination of alphabets, numbers
		// and
		// special characters.
		cds.postalCode().click();
		Thread.sleep(2000);
		cds.postalCode().sendKeys(Keys.chord(Keys.CONTROL, "a"), String.valueOf(474011));
		Thread.sleep(2000);

		// Assertion
		String actualValZip = assertValue();
		String expectValZip = String.valueOf(474011);
		Assert.assertEquals(actualValZip, expectValZip);
		System.out.println("Verified successfully for Zip/Postal code");

		// to verify that country from the country is selectable;
		cds.countryDrop().click();
		Thread.sleep(2000);
		
		while(true)
		{
			cds.countryDrop().sendKeys(Keys.ARROW_DOWN);
			String contr = cds.countryDrop().getText();
			if(contr.equalsIgnoreCase("India"))
			{
				break;
			}
		}
		Thread.sleep(2000);
		
		
		
		
		
		// to verify email text field is accepting the input.
		cds.email1().click();
		Thread.sleep(2000);
		cds.email1().sendKeys(Keys.chord(Keys.CONTROL, "a"), "abc@gmail.com");
		Thread.sleep(2000);

		// Assertion
		String actualValEmail = assertValue();
		String expectValEmail = "abc@gmail.com";
		Assert.assertEquals(actualValEmail, expectValEmail);
		System.out.println("Verified successfully for Email");


//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		WebElement Element = driver.findElement(By.xpath("//div[text()='India']"));
//		js.executeScript("arguments[0].scrollIntoView();", Element);
//		Thread.sleep(1000);
//		Element.click();
		
		
		// to logout from the account
		cds.userName().click();
		Thread.sleep(2000);
		cds.logOut().click();
		
		Thread.sleep(2000);
		driver.close();


	}

}
