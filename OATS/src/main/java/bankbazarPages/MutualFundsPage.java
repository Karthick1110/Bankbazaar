package bankbazarPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import wdMethods.bankBazzarProjectMethods;

public class MutualFundsPage extends bankBazzarProjectMethods {

	public MutualFundsPage clickSearchMutualFunds() {		
		WebElement ele = locateElement("linktext", "Search for Mutual Funds");
		ele.click();
		return this;	
	}
	
	public MutualFundsPage selectAge() throws InterruptedException {
		Thread.sleep(2000);		
		WebElement ele = locateElement("xpath", "//div[@class='rangeslider__handle']");
		Actions builder = new Actions(driver);
		Actions moveToElement = builder.dragAndDropBy(ele, (age-18)*8, 0);
		moveToElement.perform();
		return this;
	}
	
	public MutualFundsPage selectMonth() {
		WebElement ele = locateElement("xpath", "//a[contains(text(),'"+BPCustomerMonth+"')]");
		clickWithNoSnap(ele);
		return this;
	}
	
	public MutualFundsPage selectDate() {
		WebElement ele = locateElement("xpath", "(//div[contains(text(),'"+BPCustomerDate+"')])[1]");
		click(ele);
		return this;
	}
	
	public MutualFundsPage verifyBirthdate() {
		WebElement ele = locateElement("xpath", "//div[contains(text(),'Your Birthday')]/span");
		verifyPartialText(ele, BPCustomerMonth);
		return this;
	}
	public MutualFundsPage clickContinue() {
		WebElement ele = locateElement("xpath", "//a[text()='Continue']");
		clickWithNoSnap(ele);
		return this;
	}
	
	public MutualFundsPage keyNetAnnualIncome() {
		WebElement ele = locateElement("xpath", "//input[@name='netAnnualIncome']");
		ele.sendKeys("750000");
	 return this;	
	}
	
	public MutualFundsPage clickHDFCBank() throws InterruptedException {
		Thread.sleep(2000);
		locateElement("xpath", "//span[text()='HDFC']").click();;
		return this;
	}
	
	public MutualFundsPage keyCustomerFname() {
		WebElement ele = locateElement("xpath", "//input[@name='firstName']");
		ele.sendKeys("Karthick");
		return this;
	}
	public InvestInResultPage clickViewMutualFunds() throws InterruptedException {
		Thread.sleep(1500);
		locateElement("xpath", "//a[text()='View Mutual Funds']").click();
		return new InvestInResultPage();
	}
}