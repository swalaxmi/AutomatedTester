package com.qa.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseclass.BaseTest;
import com.qa.pagelocators.ChapterThreePage;
import com.qa.pagelocators.HomePage;

import junit.framework.Assert;

public class ChapterThreeTestPage extends BaseTest{
	
	HomePage homepage;
	ChapterThreePage chapterthreepage;
	
	public ChapterThreeTestPage(){
		super();
	}
	
	@BeforeMethod
	public void setUP(){
		initialsetUp();
		homepage = new HomePage();
		try {
			homepage.navigateToThirdPage();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		chapterthreepage = new ChapterThreePage();
	}
	
	@Test(priority=1)
	public void verifyTextTwoPresence(){
		boolean texttwo = chapterthreepage.textTwoPresence();
		Assert.assertTrue(texttwo);
	}
	
	@Test(priority=2)
	public void verifyDatePresence(){
		boolean date = chapterthreepage.datePresence();
		Assert.assertTrue(date);
	}
	
	@AfterMethod
	public void tearDown(){
		driver.close();
	}
	
	
}
