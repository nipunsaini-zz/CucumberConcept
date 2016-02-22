package cucumber.steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class myFeatureSteps {
	
	WebDriver driver = new FirefoxDriver();
	
	@Given("^user go to shutterstock qa website$")
	public void user_go_to_shutterstock_qa_website() throws Throwable {
		driver.get("http://www.qa.shutterstock.com");
	}

	@When("^user enter search keyword in search bar$")
	public void user_enter_search_keyword_in_search_bar() throws Throwable {
		driver.findElement(By.id("search-input")).sendKeys("car");
	}

	@And("^user click on the search button$")
	public void user_click_on_the_search_button() throws Throwable {
		driver.findElement(By.xpath("//*[@id='site-search']/div/div/span/button")).click();
	}

	@Then("^user is navigated to cat\\.mhtml page$")
	public void user_is_navigated_to_cat_mhtml_page() throws Throwable {
		Assert.assertTrue(driver.getCurrentUrl().contains("cat.mhtml"));
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id='filters']/div[1]/h1/b")).getText().equalsIgnoreCase("car"));
	}	

	@And("^user close the browser$")
	public void user_close_the_browser() throws Throwable {
		driver.close();
		driver.quit();
	}

	@When("^user click on link \"([^\"]*)\"$")
	public void user_click_on_link(String link) throws Throwable {
		driver.findElement(By.linkText(link)).click();
	}

	@Then("^check the title should be \"([^\"]*)\"$")
	public void check_the_title_should_be(String title) throws Throwable {
		Assert.assertTrue(driver.getTitle().equals(title));
	}
	
	@When("^user submit free browse signup form$")
	public void user_submit_free_browse_signup_form(DataTable table) throws Throwable {
		List<List<String>> data = table.raw();
		driver.findElement(By.id("user-register")).sendKeys(data.get(1).get(1));
		driver.findElement(By.id("email-register")).sendKeys(data.get(2).get(1));
		driver.findElement(By.id("pass-register")).sendKeys(data.get(3).get(1));
		driver.findElement(By.id("agree-to-tos")).click();
		driver.findElement(By.id("subscribe-submit-button")).click();
	}

	@Then("^user navigated to LIHP$")
	public void user_navigated_to_LIHP() throws Throwable {
		Assert.assertTrue(driver.getCurrentUrl().contains("index-in.mhtml"));
	}


}
