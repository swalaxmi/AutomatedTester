package com.qa.pagelocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseclass.BaseTest;

public class ChapterThreePage extends BaseTest {
	
	@FindBy(xpath="//div[contains(text(),'pool')]")
	WebElement texttwo;
	
	@FindBy(className="multiplewindow")
	WebElement date;
	
	public ChapterThreePage(){
		PageFactory.initElements(driver, this);
	}
	
	public boolean textTwoPresence(){
		boolean texttwopresence = texttwo.isDisplayed();
		return texttwopresence;
	}
	
	public boolean datePresence(){
		boolean datepresence = date.isDisplayed();
		return datepresence;
	}
	
}
