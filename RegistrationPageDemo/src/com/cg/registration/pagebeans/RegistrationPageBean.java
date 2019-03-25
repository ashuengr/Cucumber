package com.cg.registration.pagebeans;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPageBean {

	@FindBy(how=How.NAME,name="userid")
	private WebElement userId;
	
	@FindBy(how=How.NAME,name="password")
	private WebElement password;
	
	@FindBy(how=How.NAME,name="username")
	private WebElement userName;
	
	@FindBy(how=How.NAME,name="addr")
	private WebElement address;
	
	@FindBy(how=How.NAME,name="country")
	private WebElement country;
	
	@FindBy(how=How.NAME,name="zip")
	private WebElement zip;
	
	@FindBy(how=How.NAME,name="email")
	private WebElement email;
	
	@FindBy(how=How.NAME,name="gender")
	private List <WebElement> gender;

	@FindBy(how=How.NAME,name="languages")
	private List <WebElement> languages;

	@FindBy(how=How.NAME,name="desc")
	private WebElement desc;
	
	@FindBy(how=How.NAME,name="submit")
	private WebElement submitBtn;
	
	
	public String getUserId() {
		return userId.getAttribute("value");
	}

	public void setUserId(String userId) {
		this.userId.sendKeys(userId);
	}

	public String getPassword() {
		return password.getAttribute("value");
	}

	public void setPassword(String password) {
		this.password.sendKeys(password);
	}

	public String getUserName() {
		return userName.getAttribute("value");
	}

	public void setUserName(String userName) {
		this.userName.sendKeys(userName);
	}

	public String getAddress() {
		return address.getAttribute("value");
	}

	public void setAddress(String address) {
		this.address.clear();
		this.address.sendKeys(address);
	}

	public String getCountry() {
		return new Select(this.country).getFirstSelectedOption().getText();
	}

	public void setCountry(String country) {
		Select select = new Select(this.country);
		select.selectByVisibleText(country);
	}

	public String getZip() {
		return zip.getAttribute("value");
	}

	public void setZip(String zip) {
		this.zip.sendKeys(zip);
	}

	public String getEmail() {
		return email.getAttribute("value");
	}

	public void setEmail(String email) {
		this.email.sendKeys(email);
	}

	public String getGender() {
    for(WebElement webElement: gender)
    	if(webElement.isSelected())
		return webElement.getAttribute("value");
    return null;
	}

	public String[] getLanguages() {
		return null;
	}

	public void setLanguages(String[] languages) {
		for(String webElement:languages) {
			if(languages.equals("english"))
				this.languages.get(0).click();
			else if(languages.equals("nonenglish"))
				this.languages.get(1).click();
		}
	}

	public void setGender(String gender) {
		if(gender.equalsIgnoreCase("male"))
		this.gender.get(0).click();
		else
			this.gender.get(1).click();
	}

	public String getDesc() {
		return desc.getAttribute("values");
	}

	public void setDesc(String desc) {
		this.desc.sendKeys(desc);
	}

	public String getButton() {
		return submitBtn.getAttribute("values");
	}
	public void clickSignUp() {
		submitBtn.submit();
	}
}
