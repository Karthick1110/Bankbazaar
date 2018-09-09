package wdMethods;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class bankBazzarProjectMethods extends SeMethods {

	public static String BPCustomerIncome;
	String url = "https://www.bankbazaar.com";
	
	@BeforeMethod
	public void launchBrowser() {
		startApp("chrome", url);
		
	}
	
	@AfterMethod(groups="common")
	public void close() {
	//	closeAllBrowsers();
	}
}
