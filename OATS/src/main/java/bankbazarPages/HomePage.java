package bankbazarPages;

import org.openqa.selenium.WebElement;

import wdMethods.bankBazzarProjectMethods;

public class HomePage extends bankBazzarProjectMethods{

		public HomePage clickInvestments() {
			WebElement ele = locateElement("linktext", "INVESTMENTS");
			ele.click();
			return this;
		}
	
		public MutualFundsPage clickMutualFunds() {
			WebElement ele = locateElement("linktext", "Mutual Funds");
			ele.click();
			return new MutualFundsPage();
		}		
	
}
