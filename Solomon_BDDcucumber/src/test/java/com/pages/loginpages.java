  package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Library.Baseclass;

public class loginpages extends Baseclass {
	
	public loginpages(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		

}
 @FindBy(xpath="//span[@class='sc-iSDuPN gMdRAH']")
 WebElement search;
 
 @FindBy(xpath="//input[@type='text']")
 WebElement cinema;

public void locator() {
	
	search.click();
}

public void locator1() {
	cinema.sendKeys("maamannan");
	
}
 
  





}