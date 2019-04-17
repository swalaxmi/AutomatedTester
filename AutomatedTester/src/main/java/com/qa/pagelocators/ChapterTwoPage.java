package com.qa.pagelocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseclass.BaseTest;

public class ChapterTwoPage extends BaseTest{
	
	@FindBy(linkText = "Index")
	WebElement homepage;
	
	@FindBy(id="find")
	WebElement text;
	
	@FindBy(name="but2")
	WebElement buttonwithname;
	
	@FindBy(id="random")
	WebElement randombutton;
	
	@FindBy(xpath="//div[contains(text(),'This element has a ID that changes every time the page is loaded')]")
	WebElement dynamictext;
	
	@FindBy(xpath="//div[@id='divontheleft']/input[2]")
	WebElement siblingbutton;
	
	@FindBy(name="verifybutton")
	WebElement verifybutton;
	
	@FindBy(name="verifybutton1")
	WebElement chocolatebutton;
	
	@FindBy(id="but1")
	WebElement idbutton;
	
	public ChapterTwoPage(){
		PageFactory.initElements(driver, this);
	}
	
	public void navigateToHomePage(){
		homepage.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public boolean checkTextPresence(){
		boolean message = text.isDisplayed();
		return message;
	}
	
	public void clickOnRandomButton(){
		randombutton.click();
	}
	
	public void clickOnButtonName(){
		buttonwithname.click();
	}
	
	public boolean checkDynamicTextPresence(){
		boolean dynamicmessage = dynamictext.isDisplayed();
		return dynamicmessage;
	}
	
	public void clickOnSiblingButton(){
		siblingbutton.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void clickOnVerifyButton(){
		verifybutton.click();
	}
	
	public void clickOnChocolateButton(){
		chocolatebutton.click();
	}
	
	public void clickOnIdButton()
	{
		idbutton.click();
	}

}
