package pages;


import wdMethods.ProjectMethods;

public class ViewLeadPage extends ProjectMethods{


	public OpenTabCRMPage clickEditButton() {
		click(locateElement("linkText", "Edit"));
		return new OpenTabCRMPage(); 
	}
	
}









