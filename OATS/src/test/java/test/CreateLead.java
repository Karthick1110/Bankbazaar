/*package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;

public class CreateLead {

	public static ChromeDriver driver;

	@Given("launch the chrome browser")
	public void launchBroser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}
	@And ("maximize the browser")
	public void maximizeBrwoser() {
		driver.manage().window().maximize();

	}
	@And ("set the timeouts")
	public void setTimeout() {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	@And ("enter the url as (.*)")
	public void hitUrl(String url) {
		driver.get(url);
	}
	@And ("enter the user name as (.*)")
	public void enterUserName(String uName) {
		driver.findElementById("username").sendKeys(uName);
	}
	@And ("enter the password as (.*)")
	public void enterPassword(String pass) {
		driver.findElementById("password").sendKeys(pass);
	}
	@And ("click on the login button")
	public void clickLogin() {
		driver.findElementByClassName("decorativeSubmit").click();
	}
	@And ("click on the CRMSFA link")
	public void clickCRMSFALink() {
		driver.findElementByLinkText("CRM/SFA").click();
	}
	@And ("click on Create Lead")
	public void clickCreateLeadButton() {
		driver.findElementByLinkText("Create Lead").click();
	}
	@And ("enter the companyname as (.*)")
	public void enterCompanyName(String companyName) {
		driver.findElementById("createLeadForm_companyName").sendKeys(companyName);
	}
	@And ("enter the firstname as (.*)")
	public void enterFirstName(String name) {
		driver.findElementById("createLeadForm_firstName").sendKeys(name);
	}
	@And ("enter the lastname as (.*)")
	public void enterLastName(String lname) {
		driver.findElementById("createLeadForm_lastName").sendKeys(lname);
	}
	@When("click on the create Lead")
	public void clickCreateButton() {
		driver.findElementByClassName("smallSubmit").click();
	}
	@Then("Lead should be created succesfully")
	public void verifyCreateLead() {
		System.out.println("Create Lead is sucessfull");
	}

}
*/