package com.qa.pagelocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseclass.BaseTest;

public class HomePage extends BaseTest {
	
	
	
	@FindBy(linkText="Chapter1")
	WebElement chapterOne;
	
	@FindBy(linkText="Chapter2")
	WebElement chapterTwo;
	
	@FindBy(linkText="Chapter3")
	WebElement chapterThree;
	
	@FindBy(xpath="//a[contains(text(),'Chapter4')]")
	WebElement chapterFour;
	
	@FindBy(xpath="//a[contains(text(),'Chapter8')]")
	WebElement chapterEight;
	
	@FindBy(id="q")
	WebElement inputfield;
	
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	
	public String validateHomePageTitle(){
		String title = driver.getTitle();
		return title;
	}
	
		
	public ChapterOnePage navigateToChapterOnePgae() throws InterruptedException{
		chapterOne.click();
		Thread.sleep(5000);
		return new ChapterOnePage();
	}
	
	public ChapterTwoPage navigateToTwoPage(){
		chapterTwo.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ChapterTwoPage();
	}
	
	public ChapterThreePage navigateToThirdPage() throws InterruptedException{
		chapterThree.click();
		Thread.sleep(5000);
		return new ChapterThreePage();
	}
	
	public ChapterFourPage navigateToFourthPage() throws InterruptedException{
		chapterFour.click();
		Thread.sleep(5000);
		return new ChapterFourPage();
	}
	
	public ChapterEightPage navigatToEigthPage() throws InterruptedException{
		chapterEight.click();
		Thread.sleep(5000);
		return new ChapterEightPage();
	}
	public void enterTextToTheField() throws InterruptedException{
		inputfield.sendKeys("Welcome");
		Thread.sleep(2000);
	}
	
		
	}
	
