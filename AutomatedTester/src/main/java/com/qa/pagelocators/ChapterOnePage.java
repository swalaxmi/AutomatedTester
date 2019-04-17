package com.qa.pagelocators;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.baseclass.BaseTest;

public class ChapterOnePage extends BaseTest {
	@FindBy(id="radiobutton")
	WebElement radbutton;
	
	@FindBy(id="selecttype")
	WebElement idetype;
	
	@FindBy(name="selected(1234)")
	WebElement idecheckbox;
	
	@FindBy(id="divontheleft")
	WebElement text;
	
	@FindBy(id="verifybutton")
	WebElement verifybutton;
	
	@FindBy(className="multiplewindow")
	WebElement multiplewindow1;
	
	@FindBy(className="multiplewindow2")
	WebElement multiplewindow2;
	
	@FindBy(id="closepopup")
	WebElement windowclose;
	
	@FindBy(id="closepopup")
	WebElement secondwindowclose;
	
	@FindBy(id = "loadajax")
	WebElement ajaxelement;
	
	@FindBy(xpath = "//p[contains(text(),'The following text has been loaded from another page on this site')]")
	WebElement ajaxtext;
	
	@FindBy(id = "secondajaxbutton")
	WebElement ajaxbutton;
	
	@FindBy(xpath = "//div[contains(text(),'I have been added with a timeout')]")
	WebElement ajaxsecondtext;
	
	@FindBy(id="storeinput")
	WebElement storeinput;
	
	
	public ChapterOnePage(){
		PageFactory.initElements(driver, this);
	}
	
	public boolean clickOnRadioButton(){
		radbutton.click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean buttonselect = radbutton.isSelected();
		return buttonselect;
	}
	
	public void selectIDEType(){
		Select ide = new Select(idetype);
		ide.selectByValue("Selenium Code");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public boolean checkIDECheckBox(){
		idecheckbox.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean checkboxselect = idecheckbox.isSelected();
		return checkboxselect;
	}
	
	public boolean clickOnVerifyButton(){
		verifybutton.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean veributton = verifybutton.isDisplayed();
		return veributton;
	}
	
	public boolean clickOnText(){
		boolean textpresent = text.isDisplayed();
		return textpresent;
	}
	
	public void clickOnFristWindow(){
		multiplewindow1.click();
		Set<String> windowids = driver.getWindowHandles();
		Iterator<String> it = windowids.iterator();
		String parentid = it.next();
		String childid = it.next();
		driver.switchTo().window(childid);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Now switched to "+ driver.getTitle() +" child window");
		windowclose.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Closed the child window");
		driver.switchTo().window(parentid);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Switched to parent window");
		
	}
	
	public boolean clickOnAjaxElement(){
		ajaxelement.click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean ajtext = ajaxtext.isDisplayed();
		return ajtext;
	}
	
	public boolean clickOnAjaxButton(){
		ajaxbutton.click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean ajsectext = ajaxsecondtext.isDisplayed();
		return ajsectext;
		
	}
	
	public void clickOnSecondWindow(){
		multiplewindow2.click();
		Set<String> windowids = driver.getWindowHandles();
		Iterator<String> it = windowids.iterator();
		String parentid = it.next();
		String childid = it.next();
		driver.switchTo().window(childid);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//String childwindow = driver.getTitle();
		//System.out.println("Child window title: "+childwindow);
		secondwindowclose.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.switchTo().window(parentid);
		String parentwindowtitle = driver.getTitle();
		System.out.println("Parent window title: "+parentwindowtitle);
		
	}
	
	public void storeInputValue(){
		storeinput.sendKeys("Input Entered");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
}
