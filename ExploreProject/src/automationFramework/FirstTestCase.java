package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.safari.SafariDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.out.println("Hello");
		//System.setProperty("webdriver.gecko.driver", "E://Chrome Driver//Firefox//geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		//System.setProperty("webdriver.chrome.driver", "E://Chrome Driver//chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver", "E://Chrome Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.hdfcbank.com/");
		//driver.findElement(BY.lin)
		//System.out.println("Opened the browser");
		//Thread.sleep(3000);
		//driver.close();

	}

}
