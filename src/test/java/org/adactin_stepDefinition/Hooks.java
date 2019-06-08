package org.adactin_stepDefinition;

import java.io.File;
import java.io.IOException;

import org.baseclass.BaseClass;
import org.junit.Before;

import com.cucumber.listener.Reporter;

import cucumber.api.Scenario;
import cucumber.api.java.After;

public class Hooks {

	@cucumber.api.java.Before
	public void beforeHook() {
		// TODO Auto-generated method stub
		System.out.println("Before Hookkkkkkkkkkkkkkkkkkkkkkkk");
	}

	@After
	public void afterHook(Scenario scenario) throws Exception {
		String status = scenario.getStatus();
		System.out.println(status);+
		if (status.contains("pass")) {
			File takeScreenShot = BaseClass.takeScreenShot(scenario.getName());
			Reporter.addScreenCaptureFromPath(takeScreenShot.getAbsolutePath());
		}
		// TODO Auto-generated method stub
		System.out.println("After Hookkkkkkkkkkkkkkkkkkkkkkkk");
	}

}
