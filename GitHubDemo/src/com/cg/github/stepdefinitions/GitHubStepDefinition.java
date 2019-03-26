package com.cg.github.stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.cg.github.pagebeans.LoginPage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GitHubStepDefinition {
	private WebDriver driver;
	private LoginPage loginPage;
	@Before
	public void setUpStepEnv() {
		System.setProperty("webdriver.chrome.driver", "D:\\3000132_Ankush_Bathla\\BddCucumberSellenium\\chromedriver.exe");
	    }
	
	@Given("^User is on main page www\\.github\\.com$")
	public void user_is_on_main_page_www_github_com() throws Throwable {
	  driver = new ChromeDriver();
	  driver.get("https://github.com/login");
	  loginPage=PageFactory.initElements(driver,LoginPage.class);
	}

	@When("^user gives incorrect Username and incorrect Password$")
	public void user_gives_incorrect_Username_and_incorrect_Password() throws Throwable {
	    loginPage.setUsername("ankushbathla");
	    loginPage.setPassword("ankush");
	    loginPage.clickSignIn();
	}

	@Then("^User should be redirected to the same page with error: Username or password is incorrect$")
	public void user_should_be_redirected_to_the_same_page_with_error_Username_or_password_is_incorrect() throws Throwable {
	  String expectedErrorMessage="Incorrect username or password.";
	  Assert.assertEquals(expectedErrorMessage,loginPage.getActualErrorMessage());
	}
	@When("^user gives correct details$")
	public void user_gives_correct_details() throws Throwable {
	    loginPage.setUsername("bathlaankush15@stu.upes.ac.in");
	    loginPage.setPassword("Hr24u5605");
	    loginPage.clickSignIn();
	}

	@Then("^A page should return with index page showing details of user$")
	public void a_page_should_return_with_index_page_showing_details_of_user() throws Throwable {
	    String actualTitle=driver.getTitle();
	    String expectedTitle="GitHub";
	    Assert.assertEquals(expectedTitle, actualTitle);
	}
/*	@After 
    public void tearDownSetEnv(){
		driver.close();
	}*/
}
