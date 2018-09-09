package pages;

import org.openqa.selenium.WebElement;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MyHomePage extends ProjectMethods{

	
	public MyLeadsPage clickLeads() {
		WebElement eleLeads = locateElement("linktext", "Leads");
		click(eleLeads);
		return new MyLeadsPage();
	}
	
}









