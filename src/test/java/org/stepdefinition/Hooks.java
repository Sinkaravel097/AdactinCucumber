package org.stepdefinition;

import org.base.Base;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Base{
	
	@Before
	public void beforeExecution() {
		chrome();
		maxWindow();
		deleteCookies();
	}
	
	@After
	public void afterExecution(Scenario s) {
		if (s.isFailed()) {
			TakesScreenshot ts = (TakesScreenshot)driver;
			byte[] screenshotAs = ts.getScreenshotAs(OutputType.BYTES);
			s.embed(screenshotAs, "image/png");
			System.out.println(s.getName()+"****Scenario Failed****");
		}
		System.out.println("*****Scenario Ends*****");	
	}

}
