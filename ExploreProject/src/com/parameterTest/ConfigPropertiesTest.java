package com.parameterTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ConfigPropertiesTest {

	WebDriver driver;
	@Test
	public void configPropTest() throws IOException{
		Properties pr = new Properties();
		FileInputStream ip = new FileInputStream("E:/Automation/ExploreProject/src/config.properties");
		pr.load(ip);
		//System.out.println(pr.get("browser"));
		String browser = pr.getProperty("browser");
		if (browser.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "E://Chrome Driver//chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (browser.equals("firefox")){
			System.setProperty("webdriver.gecko.driver", "E://Chrome Driver//Firefox//geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else
		{
			System.out.println("NO browser is selected");
		}
		driver.get(pr.getProperty("url"));
		driver.findElement(By.name("identifier")).sendKeys(pr.getProperty("emailId"));
		driver.findElement(By.xpath("//*[@id='identifierNext']/content/span")).click();
		String pswd = pr.getProperty("pasword");
		driver.findElement(By.name("password")).sendKeys("hello");
		driver.findElement(By.xpath("//*[@id='passwordNext']/div[2]")).click();
	}
	
	
}
