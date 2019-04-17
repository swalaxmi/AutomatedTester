package com.qa.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	public static WebDriver driver;
	public static Properties property;
	
	public BaseTest(){
		
		try {
			property = new Properties();
			FileInputStream fis = new FileInputStream("E:\\Automation\\AutomatedTester\\src\\main\\java\\com\\qa\\propertyfiles\\config.properties");
				property.load(fis);
			} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
				e.printStackTrace();
			}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}

	}
	
	public static void initialsetUp(){
		//String browsername = property.getProperty("browser");
		//System.out.println(browsername);
		//if (browsername.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "E://Chrome Driver//chromedriver.exe");
			driver = new ChromeDriver();
		//}
		/*else if(browsername.equals("firefox")){
			System.setProperty("webdriver.gecko.driver", "E://Chrome Driver//Firefox//geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else{
			System.out.println("Please mention proper browser name");
		}*/
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
		//String appURL = ;
		driver.get(property.getProperty("url"));
	}
	
	public void inFailureCase(String testMethodName){
		File sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(sourceFile, new File("E:/Automation/AutomatedTester/Failed Tests Screenshots/"+testMethodName+"_"+".jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
		

}
	
	
