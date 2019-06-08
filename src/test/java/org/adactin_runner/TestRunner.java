package org.adactin_runner;

import java.io.File;

import org.adactin.helper.PropertyReaderManager;
import org.adactin_stepDefinition.UIAbstract;
import org.baseclass.BaseClass;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "com.cucumber.listener.ExtentCucumberFormatter:src\\test\\resource\\reports\\report.html",
		"html:src\\test\\resource\\reports", "json:src\\test\\resource\\reports\\report.json",
		"junit:src\\test\\resource\\reports\\report.xml" },

		features = "src\\test\\java\\org\\adactin_feature", tags = "@test", glue = {
				"org.adactin_stepDefinition" }, dryRun = false,

		strict = true, monochrome = true)

public class TestRunner {
	public static WebDriver driver;

	@BeforeClass
	public static void driverInitialization() throws Throwable {
		String browserName = PropertyReaderManager.getInstance().getPr().getBrowserName();
		// driver = LingsBaseClass.getBrowser(browserName);

		driver = BaseClass.getBrowser(browserName);

	}

	@AfterClass
	public static void driverQuit() {
		Reporter.loadXMLConfig(new File("src\\test\\resource\\com\\configuration\\extent-config.xml"));

		driver.quit();
	}

}
