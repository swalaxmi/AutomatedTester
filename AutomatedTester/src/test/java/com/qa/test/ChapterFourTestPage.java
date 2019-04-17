package com.qa.test;

import org.testng.annotations.BeforeMethod;

import com.qa.pagelocators.ChapterFourPage;
import com.qa.pagelocators.HomePage;

public class ChapterFourTestPage {

	HomePage homepage;
	ChapterFourPage chapterfourpage;
	
	public ChapterFourTestPage(){
			super();
	}
	
	@BeforeMethod
	public void setUp(){
		homepage = new HomePage();
		chapterfourpage = new ChapterFourPage();
	}
	
}
