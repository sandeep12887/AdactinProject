package org.adactin_stepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UIAbstract {
	public static WebDriver driver;

	@Before
	public static WebDriver setup(String browserName) throws Exception {
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\admin\\eclipse-workspace\\AdactinHotelReservation\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "/firefoxpath");
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("")) {

		} else {
			throw new Exception("not a valid browser name");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;

	}
}
