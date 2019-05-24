package com.qa.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseclass.BaseTest;
import com.qa.pagelocators.ChapterFourPage;
import com.qa.pagelocators.HomePage;

import junit.framework.Assert;

public class ChapterFourTestPage extends BaseTest {

	HomePage homepage;
	ChapterFourPage chapterfourpage;
	
	public ChapterFourTestPage(){
			super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialsetUp();
		homepage = new HomePage();
		try {
			homepage.navigateToFourthPage();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		chapterfourpage = new ChapterFourPage();
	}
	
	@Test
	public void verifyAlertInputField(){
		String alertText = chapterfourpage.checkAlertInputField(); 
		Assert.assertEquals(alertText,"inputbox");
	}
	
	@AfterMethod
	public void tearDown(){
		driver.close();
	}
	
	
}
