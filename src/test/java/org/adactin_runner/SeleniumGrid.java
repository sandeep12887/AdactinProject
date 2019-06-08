package org.adactin_runner;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGrid {

	public static void main(String[] args) throws Throwable {

		DesiredCapabilities chrome = DesiredCapabilities.chrome();
		chrome.setPlatform(Platform.WIN10);
		chrome.setBrowserName("chrome");
		//chrome.setCapability("version", "74.0.3729");
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.14:4444/wd/hub"), chrome);
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("hello");
	}
}
