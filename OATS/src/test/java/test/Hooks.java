package test;

import cucumber.api.Scenario;
import cucumber.api.java.*;
import wdMethods.SeMethods;

public class Hooks extends SeMethods{
	public String url = "http://leaftaps.com/opentaps";
	@Before
	public void beforeMethods(Scenario sc) {
		startResult();
		testCaseName = sc.getName();
		testCaseDescription =sc.getId();
		category = "Smoke";
		startTestCase();
		startApp("chrome", url);
		
	}
	
	@After
	public void AfterMethods(Scenario sc) {
		closeAllBrowsers();
		stopResult();
	}
	
	
}
