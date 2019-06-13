package org.adactin_runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\org\\adactin_feature",
glue="org.adactin_stepDefinition",
dryRun=false,
strict=true,
monochrome=true)
public class Runner {
	
	
	

}
