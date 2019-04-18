package com.parameterTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	WebDriver driver;
	
/*	@BeforeMethod
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", "E://Chrome Driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.gmail.com");
		
	}*/
	
	@Test
	@Parameters({ "emailId", "password" })
	public void loginPage(String emailId, String password){
		System.setProperty("webdriver.chrome.driver", "E://Chrome Driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.gmail.com");
		
		driver.findElement(By.name("identifier")).clear();
		driver.findElement(By.name("identifier")).sendKeys(emailId);
		
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(password);
		
	}
	
	/*@AfterMethod
	public void tearDown(){
		driver.close();
		
	}*/

}
