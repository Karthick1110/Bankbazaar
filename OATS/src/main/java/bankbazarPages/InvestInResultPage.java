package bankbazarPages;

import java.util.List;

import org.openqa.selenium.WebElement;

import wdMethods.bankBazzarProjectMethods;

public class InvestInResultPage extends bankBazzarProjectMethods {

	public InvestInResultPage closePopup() throws InterruptedException {
		Thread.sleep(5000);
		
		WebElement locateElement = locateElement("xpath", "//span[@id='closeExitBlockerModal']");
		
		if(locateElement.isDisplayed()==true) {
			locateElement.click();
		}
		return this;
	}
	
	public InvestInResultPage offerTables() {
		List<WebElement> findElementsByXPath = driver.findElementsByXPath("//section[@id='offer-table']/section");
		for (WebElement webElement : findElementsByXPath) {
			System.out.println(webElement.getTagName() + " : " + webElement.getAttribute("data-bank"));
		}
		
		return this;
	}
}
