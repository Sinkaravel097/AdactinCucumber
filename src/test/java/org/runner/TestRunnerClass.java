package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.jvmreport.JvmReport;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", glue = "org.stepdefinition", dryRun = false, monochrome = true, plugin = {
		"html:target", "json:target//report.json","junit:target//xmlreport.xml"})
public class TestRunnerClass {

	@AfterClass
	public static void reportGeneration() {
		JvmReport.generateJvmReport(System.getProperty("user.dir")+"\\target\\report.json");
	}
	
}
