package pages;

import org.openqa.selenium.WebElement;

import wdMethods.ProjectMethods;

public class FindLeadsPage extends ProjectMethods{

	
	public FindLeadsPage typeFirstName	(String data) {
		WebElement eleFirstName = locateElement("name", "firstName");
		type(eleFirstName, data);
		System.out.println("Element check");
		return this;
	}
	public FindLeadsPage typeLastName	(String data) {
		WebElement eleLastName = locateElement("name", "lastName");
		type(eleLastName, data);
		return this;
	}
	
	public FindLeadsPage clickFindLeadBtn() {
		WebElement eleFindLeadButton= locateElement("xpath", "//button[text()='Find Leads']");
		clickWithNoSnap(eleFindLeadButton);
		return this; 
	}
	
	public ViewLeadPage ClickOnTheFirstResult() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));

		return new ViewLeadPage();
	}
	
	public FindLeadsPage clickPhonetab() {
		WebElement phonetab = locateElement("xpath", "//span[text()='Phone']");
		click(phonetab);
		return this;
	}
	
	public FindLeadsPage typePhoneNumner(String data) {
		WebElement elePhoneNumber = locateElement("name", "phoneNumber");
		type(elePhoneNumber, data);
		return this;
	}
	
}









