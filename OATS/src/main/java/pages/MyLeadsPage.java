package pages;

import org.openqa.selenium.WebElement;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MyLeadsPage extends ProjectMethods{

	@And("click on Create Lead")
	public CreateLeadPage clickCreateLead() {
		WebElement eleCreateLead = locateElement("linktext", "Create Lead");
		click(eleCreateLead);
		return new CreateLeadPage();
	}
	
	public FindLeadsPage clickFindLeadMenu() {
		WebElement eleFindLead = locateElement("linktext", "Find Leads");
		click(eleFindLead);
		return  new FindLeadsPage();
	}
	
}









