package com.qa.pagelocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseclass.BaseTest;

public class ChapterFourPage extends BaseTest {

	@FindBy(id="blurry")
	WebElement alertfield;
	
	@FindBy(id="selectLoad")
	WebElement loadbutton;
	
	@FindBy(id="nextBid")
	WebElement innerfield;
	
	
	public ChapterFourPage(){
		PageFactory.initElements(driver, this);
	}
	
	public String checkAlertInputField(){
		alertfield.sendKeys("inputbox");
		loadbutton.click();
		String alerttext = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		return alerttext;
	}
	
	public void enterTextInField(){
		innerfield.sendKeys("Automation");
	}
	
}
