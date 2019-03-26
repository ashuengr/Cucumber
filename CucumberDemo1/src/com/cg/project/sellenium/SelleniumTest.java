package com.cg.project.sellenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelleniumTest {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\3000132_Ankush_Bathla\\BddCucumberSellenium\\chromedriver.exe");
    WebDriver webDriver = new ChromeDriver();
    webDriver.get("http:\\www.google.com");
    
    WebElement searchElement = webDriver.findElement(By.name("q"));
    searchElement.sendKeys("Agile Methodology");
    searchElement.submit();
    
    WebElement imageLink = webDriver.findElement(By.className("hdtb-mitem hdtb-msel hdtb-imb"));
    imageLink.click();
}
}
