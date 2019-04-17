package com.qa.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseclass.BaseTest;
import com.qa.pagelocators.ChapterTwoPage;
import com.qa.pagelocators.HomePage;

import junit.framework.Assert;

public class ChapterTwoTestPage extends BaseTest {
	
	public static HomePage homepage;
	public static ChapterTwoPage chaptertwopage;
	public ChapterTwoTestPage(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialsetUp();
		homepage = new HomePage();
		homepage.navigateToTwoPage();
		chaptertwopage = new ChapterTwoPage();
		
	}
	
	@Test (enabled=false) //(priority =1)
	public void verifyIndexHyperlinkNavigation(){
		chaptertwopage.navigateToHomePage();
	}
	
	@Test (enabled=false) //(priority =2) //
	public void verifyTextPresence(){
		boolean text = chaptertwopage.checkTextPresence();
		Assert.assertTrue(text);
		Assert.assertTrue(false);
	}
	
	@Test (enabled=false) //(priority =3)
	public void verifyRandomButtonClickable(){
		chaptertwopage.clickOnRandomButton();
	}
	
	@Test (enabled=false) //(priority =4) 
	public void verifyButtonNameButtonClickable(){
		chaptertwopage.clickOnButtonName();
	}
	
	@Test (enabled=false)//(priority =1)//
	public void verifyDynamicTextPresence(){
		chaptertwopage.checkDynamicTextPresence();
	}
	
	@Test (enabled=false) //(priority =6)//(enabled=false)
	public void verifySiblingButtonClickable(){
		chaptertwopage.clickOnSiblingButton();
	}
	
	@Test
	public void verifyIdButtonClickable(){
		chaptertwopage.clickOnIdButton();
	}
	
	@Test
	public void verifyVerifyButtonClickable(){
		chaptertwopage.clickOnVerifyButton();
	}
	
	@Test
	public void verifyChocolateButtonClickable(){
		chaptertwopage.clickOnChocolateButton();
	}
	
	@AfterMethod
	public void tearDown(){
		driver.close();
	}

}
