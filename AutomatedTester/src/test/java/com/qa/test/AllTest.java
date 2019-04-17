package com.qa.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.qa.baseclass.BaseTest;
import com.qa.pagelocators.ChapterEightPage;
import com.qa.pagelocators.ChapterFourPage;
import com.qa.pagelocators.ChapterOnePage;
import com.qa.pagelocators.ChapterThreePage;
import com.qa.pagelocators.ChapterTwoPage;
import com.qa.pagelocators.HomePage;

//Connecting test cases class to the listeners interface
//@Listeners({com.qa.Listeneres.ListenerTest.class, com.qa.Listeneres.listenerreport.class})
//@Listeners(com.qa.Listeneres.BasicExtentReport.class)

public class AllTest extends BaseTest {
	HomePage homepage;
	ChapterOnePage chapterone;
	ChapterTwoPage chaptertwo;
	ChapterThreePage chapterthree;
	ChapterFourPage chapterfour;
	ChapterEightPage chaptereight;
	
	public AllTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialsetUp();
		homepage = new HomePage();
	}
	
	@Test(priority=1)
	public void validateHomePageTitle(){
		String title = homepage.validateHomePageTitle();
		//Asert.assertEquals(title,"Selenium: Beginners Guide");
		Assert.assertEquals(title, "Selenium: Beginners Guide");
	}
	
	@Test(priority=2)
	public void navigateTochapterone() throws InterruptedException{
		chapterone = homepage.navigateToChapterOnePgae();
		 
	}
	
	@Test(priority=3)
	public void navigateTochaptertwo() throws InterruptedException{
		chaptertwo = homepage.navigateToTwoPage();
	}
	
	@Test(priority=4)
	public void navigateTochapterthree() throws InterruptedException{
		chapterthree = homepage.navigateToThirdPage();
	}
	
	@Test(priority=5)
	public void navigateTochapterfour() throws InterruptedException{
		chapterfour = homepage.navigateToFourthPage();
	}
	
	@Test(priority=6)
	public void navigateTochaptereight() throws InterruptedException{
		chaptereight = homepage.navigatToEigthPage();
	}
	
	@Test(priority=7)
	public void enterText() throws InterruptedException{
		homepage.enterTextToTheField();
	}
	
	@AfterMethod
	public void tearDown(){
		driver.close();
	}
	
	
}
