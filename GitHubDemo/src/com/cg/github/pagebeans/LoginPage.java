package com.cg.github.pagebeans;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
@FindBy(how=How.NAME,name="login")
private WebElement username;

@FindBy(how=How.NAME,name="password")
private WebElement password;

@FindBy(how=How.NAME,name="commit")
private WebElement button;

@FindBy(how=How.XPATH,xpath="//*[@id=\"js-flash-container\"]/div/div")
private WebElement actualErrorMessage;

public LoginPage() {}

public String getUsername() {
	return username.getAttribute("username");
}

public void setUsername(String username) {
	this.username.sendKeys(username);
}

public String getPassword() {
	return password.getAttribute("value");
}

public void setPassword(String password) {
	this.password.sendKeys(password);
}

public WebElement getButton() {
	return button;
}

public String getActualErrorMessage() {
	return actualErrorMessage.getText();
}

public void setActualErrorMessage(String actualErrorMessage) {
	this.actualErrorMessage.sendKeys(actualErrorMessage);
}

public void clickSignIn() {
	button.submit();
}

}
