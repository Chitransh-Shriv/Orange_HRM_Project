package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageObjectModel.LoginPageObjects;

public class BaseClass {

	public static WebDriver driver;

	public void driverAccess() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}

	public void driverInitialize() throws InterruptedException, IOException {

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\Hp\\eclipse-workspace\\24feb_testNG_framework\\src\\main\\java\\resources\\data.properties");

		Properties prop = new Properties();
		prop.load(fis);

		String browserName = prop.getProperty("browser");

		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			driverAccess();
			Thread.sleep(2000);
		}

		else if (browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
			driverAccess();
			Thread.sleep(2000);
		}

		else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			driverAccess();
			Thread.sleep(2000);
		}

		else {
			System.out.println("Please, check for the correct browser......");
		}

	}

}
