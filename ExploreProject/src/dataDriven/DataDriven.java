package dataDriven;

import java.util.ArrayList;
import java.util.Iterator;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.utility.TestDataUtil;
import com.test.utility.UtilDemo;

public class DataDriven {

	WebDriver driver;
	
	@BeforeMethod
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", "E://Chrome Driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();  // to delete all cookies and start in fresh browser
		driver.get("https://www.gmail.com");
		System.out.println("Browser opened");
	}
	
	@DataProvider
	public Iterator<Object[]> getData(){
		ArrayList<Object[]> testData = UtilDemo.getDataFromExcel();
		return testData.iterator();
	}

	@Test(dataProvider="getData")
	public void newUserReg(String firstName, String lastName, String userName, String password){
		
		driver.findElement(By.xpath("//*[@id='view_container']/div/div/div[2]/div/div[2]/div/div[2]/div/div/content/span")).click();
		
		driver.findElement(By.name("firstName")).clear();
		driver.findElement(By.name("firstName")).sendKeys(firstName);
		
		driver.findElement(By.name("lastName")).clear();
		driver.findElement(By.name("lastName")).sendKeys(lastName);
		
		driver.findElement(By.name("Username")).clear();
		driver.findElement(By.name("Username")).sendKeys(userName);
		
		driver.findElement(By.name("Passwd")).clear();
		driver.findElement(By.name("Passwd")).sendKeys(password);
	
		driver.findElement(By.name("ConfirmPasswd")).clear();
		driver.findElement(By.name("ConfirmPasswd")).sendKeys(password);
		
		driver.findElement(By.xpath("//*[@id='accountDetailsNext']/content/span")).click();
		
	}
	
	@AfterMethod
	public void tearDown(){
		driver. close();
		System.out.println("Browser closed");
	}
	
}
