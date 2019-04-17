package com.qa.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.qa.baseclass.BaseTest;
import com.qa.pagelocators.ChapterOnePage;
import com.qa.pagelocators.HomePage;

@Listeners(com.qa.Listeneres.ListenerTest.class)
public class ChapterOneTestPage extends BaseTest {
	
	public static ChapterOnePage chapteronepage;
	public static HomePage homepage; 
	
	
	public ChapterOneTestPage(){
		super();
		
	}

	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialsetUp();
		homepage = new HomePage();
		homepage.navigateToChapterOnePgae();
		chapteronepage = new ChapterOnePage();
		
		// homepage.navigateToChapterOnePgae();
	}
	
	
	@Test (enabled = false)
	public void validateRadioButtonSelected(){
		//chapteronepage = new ChapterOnePage();
		boolean selected = chapteronepage.clickOnRadioButton();
		Assert.assertTrue(selected);
	}
	
	@Test (enabled = false)
	public void ideTypeSelection(){
		//chapteronepage = new ChapterOnePage();
		chapteronepage.selectIDEType();
	}
	
	@Test(enabled = false)
	public void selectIDECheckbox(){
		boolean ideselected = chapteronepage.checkIDECheckBox();
		Assert.assertTrue(ideselected);
	}
	
	@Test (enabled = false)//(retryAnalyzer = com.qa.Listeneres.RetryAnalyzer.class)
	public void clickOnVerifyButton(){
		boolean buttonpresent = chapteronepage.clickOnVerifyButton();
		Assert.assertTrue(buttonpresent);	
	}
	
	@Test (enabled = false)
	public void verifyTextPresence(){
		boolean textpresent = chapteronepage.clickOnText();
		Assert.assertTrue(textpresent);
	}
	
	@Test(enabled = false)
	public void verifyFirstWindowOpened(){
		chapteronepage.clickOnFristWindow();
		//Assert.assertTrue(false);
	}
	
	@Test (enabled = false)
	public void verifyAjaxElementLink(){
		boolean ajatext = chapteronepage.clickOnAjaxElement();
		Assert.assertTrue(ajatext);
	}
	
	@Test (enabled = false)
	public void verifyAjaxButton(){
		boolean ajabuttontext = chapteronepage.clickOnAjaxButton();
		Assert.assertTrue(ajabuttontext);
	}
	
	@Test (enabled = false)
	public void verifySecondWindowOpened(){
		chapteronepage.clickOnSecondWindow();
		
	}

	@Test
	public void verifyInputStoedInField(){
		chapteronepage.storeInputValue();
	}
	
	
	@AfterMethod
	public void tearDown(){
		driver.close();
	}

		
}
