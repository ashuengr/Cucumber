package com.cg.registration.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.cg.registration.pagebeans.RegistrationPageBean;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegistrationStepDef {
	private WebDriver driver;
	private RegistrationPageBean pageBean;
	
	@Before
	public void setUpStepEnv() {
		System.setProperty("webdriver.chrome.driver", "D:\\3000132_Ankush_Bathla\\BddCucumberSellenium\\chromedriver.exe");
	    }
	
	@Given("^User is accessng Registration Page on Browser$")
	public void user_is_accessng_Registration_Page_on_Browser() throws Throwable {
	    driver.get("D:\\3000132_Ankush_Bathla\\WebPages");
	    pageBean=PageFactory.initElements(driver,RegistrationPageBean.class);
	}

	@When("^User is trying to submit data without entering 'User Id'$")
	public void user_is_trying_to_submit_data_without_entering_User_Id() throws Throwable {
	    pageBean.clickSignUp();
	}

	@Then("^'User Id should not be empty / length be between (\\d+) to (\\d+)' alert message should be displayed$")
	public void user_Id_should_not_be_empty_length_be_between_to_alert_message_should_be_displayed(int arg1, int arg2) throws Throwable {
	    String expectedAlertMessage="User Id should not be empty / length be between 5 to 12";
	    String actualAlertMessage=driver.switchTo().alert().getText();
	    Assert.assertEquals(expectedAlertMessage, actualAlertMessage);
	}

	@When("^User is trying to submit data without entering 'password'$")
	public void user_is_trying_to_submit_data_without_entering_password() throws Throwable {
	    driver.switchTo().alert().dismiss();
	    pageBean.setUserName("Ankush");
	    pageBean.clickSignUp();
	}

	@Then("^'Password should not be empty / length be between (\\d+) to (\\d+)' alert message should be displayed$")
	public void password_should_not_be_empty_length_be_between_to_alert_message_should_be_displayed(int arg1, int arg2) throws Throwable {
		String expectedAlertMessage="Password should not be empty / length be between 7 to 12"	;
		String actualAlertMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedAlertMessage,actualAlertMessage);
	}

	@When("^User is trying to submit data without entering 'username'$")
	public void user_is_trying_to_submit_data_without_entering_username() throws Throwable {
	  driver.switchTo().alert().dismiss();
	  pageBean.setUserId("Ankush121");
	  pageBean.clickSignUp();
	}

	@Then("^'Name should not be empty and must have alphabet characters only' alert message should be displayed$")
	public void name_should_not_be_empty_and_must_have_alphabet_characters_only_alert_message_should_be_displayed() throws Throwable {
	   String expectedAlertMessage="UserName should not be empty and must have alphabet characters only"	;
	   String actualAlertMessage=driver.switchTo().alert().getText();
	   Assert.assertEquals(expectedAlertMessage,actualAlertMessage);
	}

	@When("^User is trying to submit data without entering 'address'$")
	public void user_is_trying_to_submit_data_without_entering_address() throws Throwable {
	    driver.switchTo().alert().dismiss();
	    pageBean.setPassword("ankubathla");
	    pageBean.clickSignUp();
	}

	@Then("^'User address must have alphanumeric characters only' alert message should be displayed$")
	public void user_address_must_have_alphanumeric_characters_only_alert_message_should_be_displayed() throws Throwable {
		String expectedAlertMessage="User address must have alphanumeric characters only"	;
		String actualAlertMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedAlertMessage,actualAlertMessage);
	}

	@When("^User is trying to submit data without entering 'zipCode'$")
	public void user_is_trying_to_submit_data_without_entering_zipCode() throws Throwable {
	  driver.switchTo().alert().dismiss();
	  pageBean.setCountry("India");
	  pageBean.clickSignUp();
	}

	@Then("^'ZIP code must have numeric characters only' alert message should be displayed$")
	public void zip_code_must_have_numeric_characters_only_alert_message_should_be_displayed() throws Throwable {
		String expectedAlertMessage="ZIP code must have numeric characters only"	;
		String actualAlertMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedAlertMessage,actualAlertMessage);
	}

	@When("^User is trying to submit data without entering 'email'$")
	public void user_is_trying_to_submit_data_without_entering_email() throws Throwable {
	   driver.switchTo().alert().dismiss();
	   pageBean.setZip("125055");
	   pageBean.clickSignUp();
	}

	@Then("^'You have entered an invalid email address!' alert message should be displayed$")
	public void you_have_entered_an_invalid_email_address_alert_message_should_be_displayed() throws Throwable {
		String expectedAlertMessage="You have entered an invalid email address!"	;
		String actualAlertMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedAlertMessage,actualAlertMessage);
	}

	@When("^User is trying to submit data without entering 'country'$")
	public void user_is_trying_to_submit_data_without_entering_country() throws Throwable {
	 driver.switchTo().alert().dismiss();
	 pageBean.setAddress("Delhi");
	 pageBean.clickSignUp();
	}

	@Then("^'Select your country from the list' alert message should be displayed$")
	public void select_your_country_from_the_list_alert_message_should_be_displayed() throws Throwable {
		String expectedAlertMessage="Select your country from the list";
		String actualAlertMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedAlertMessage,actualAlertMessage);
	  }

	@When("^User is trying to submit data without entering 'gender'$")
	public void user_is_trying_to_submit_data_without_entering_gender() throws Throwable {
	    driver.switchTo().alert().dismiss();
	    pageBean.setEmail("AnkushBathla1@gmail.com");
	    pageBean.clickSignUp();
	}

	@Then("^'Press Select gender' alert message should be displayed$")
	public void press_Select_gender_alert_message_should_be_displayed() throws Throwable {
		String expectedAlertMessage="Press Select gender"	;
		String actualAlertMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedAlertMessage,actualAlertMessage);
	}

	@Given("^User is accessing RegistrationPage on Browser$")
	public void user_is_accessing_RegistrationPage_on_Browser() throws Throwable {
	   
	}

	@When("^User is trying to submit request after entering valid set of information$")
	public void user_is_trying_to_submit_request_after_entering_valid_set_of_information() throws Throwable {
	  pageBean.setUserId("ankush121");
	  pageBean.setUserName("Ankush");
	  pageBean.setPassword("ankuBathla");
	  pageBean.setAddress("Delhi110025");
	  pageBean.setCountry("India");
	  pageBean.setZip("110025");
	  pageBean.setEmail("ankushbathla1@gmail.com");
	  pageBean.setGender("Male");
	  pageBean.clickSignUp();
	}

	@Then("^'Your Registration with JobsWorld\\.com has successfully done plz check your registred email addres to activate your profile' alert message should be displayed$")
	public void your_Registration_with_JobsWorld_com_has_successfully_done_plz_check_your_registred_email_addres_to_activate_your_profile_alert_message_should_be_displayed() throws Throwable {
		String expectedAlertMessage="Your Registration with JobsWorld.com has successfully done plz check your registred email addres to activate your profile"	;
		String actualAlertMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedAlertMessage,actualAlertMessage);
	}
	@After 
    public void tearDownSetEnv(){
		driver.close();
	}
}
