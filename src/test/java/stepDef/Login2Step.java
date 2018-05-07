package stepDef;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import allBrowser.BrowserInitialize;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;

public class Login2Step {
	WebDriver driver;
	BrowserInitialize br;
	LoginPage l;
	@Given("^Admin Navigateto HRM Login page$")
	public void admin_Navigateto_HRM_Login_page() throws Throwable {
	  br = new BrowserInitialize();
	  driver= br.ChooseBrowser();
		
	}

	@When("^Admin Entervalid UseName and Password$")
	public void admin_Entervalid_UseName_and_Password() throws Throwable {
		l=new LoginPage(driver);
		l.EnterUserName1().sendKeys("Admin");
		l.EnterPassword1().sendKeys("admin");
	}

	@When("^click on LogingButton$")
	public void click_on_LogingButton() throws Throwable {
		
		l=new LoginPage(driver);
		l.ClickLogin().click();
	 
	}

	@Then("^Admin will Land in Adminhome Page$")
	public void admin_will_Land_in_Adminhome_Page() throws Throwable {
		
		Assert.assertEquals(driver.getCurrentUrl(),"http://opensource.dem.orangehrmlive.com/index.php/dashboard");
	    driver.close();
		
	    
	}

}// end class 
