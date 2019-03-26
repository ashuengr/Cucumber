package com.cg.project.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefinition {
/*	@Given("^User is on search page of www\\.bankingportal\\.com\\.$")
	public void user_is_on_search_page_of_www_bankingportal_com() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^User searches for an account\\.$")
	public void user_searches_for_an_account() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^search page should display account details of searched account\\.$")
	public void search_page_should_display_account_details_of_searched_account() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
}*/
	private WebDriver driver;
@Given("^User is on Google HomePage$")
public void user_is_on_Google_HomePage() throws Throwable {
    System.setProperty("webdriver.chrome.driver", "D:\\3000132_Ankush_Bathla\\BddCucumberSellenium\\chromedriver.exe");
   driver = new ChromeDriver();
   driver.get("https://www.google.co.in/");
    
}

@When("^User search for 'Agile Methodology'$")
public void user_search_for_Agile_Methodology() throws Throwable {
    WebElement searchElement = driver.findElement(By.name("q"));
    searchElement.sendKeys("Agile Methodology");
    searchElement.submit();
}

@SuppressWarnings("deprecation")
@Then("^All links should display with 'Agile Methodology'$")
public void all_links_should_display_with_Agile_Methodology() throws Throwable {
    String actualTitle=driver.getTitle();
    String expectedTitle="Agile Methodology - Google Search";
    Assert.assertEquals(expectedTitle, actualTitle);
    driver.close();
}
}