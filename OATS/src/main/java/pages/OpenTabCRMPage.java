package pages;

import org.openqa.selenium.WebElement;

import wdMethods.ProjectMethods;

public class OpenTabCRMPage extends ProjectMethods{


	public OpenTabCRMPage typeCompanyName(String data) {
		WebElement eleCompanyName = locateElement("name", "companyName");
		type(eleCompanyName, data);
		return this;
	}
	
	public ViewLeadPage clickUpdateButton() {
		WebElement eleSubmitButton = locateElement("class", "smallSubmit");
		clickWithNoSnap(eleSubmitButton);
		return 	new ViewLeadPage();
	}
	
}









