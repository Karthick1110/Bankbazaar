package bankbazarTestCases;

import org.testng.annotations.*;

import bankbazarPages.HomePage;
import wdMethods.bankBazzarProjectMethods;

public class Testcase_001 extends bankBazzarProjectMethods {
	@BeforeClass
	public void setData() {
		testCaseName = "TC001_CreateLead";
		testCaseDescription ="Create a lead";
		category = "Smoke";
		author= "Karthick";
		age=28;
		BPCustomerMonth="Apr";
		BPCustomerDate=4;
	}
	
	@Test
	public void testSteps() throws InterruptedException {
		new HomePage()
		.clickInvestments().clickMutualFunds()
		.clickSearchMutualFunds().selectAge().selectMonth()
		.selectDate().verifyBirthdate().clickContinue()
		.keyNetAnnualIncome().clickContinue()
		.clickHDFCBank().keyCustomerFname().clickViewMutualFunds().closePopup().offerTables();
		
	}
	
}
