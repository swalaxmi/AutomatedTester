package automationFramework;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.apache.commons.io.FileUtils;

public class Miscellaneous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E://Chrome Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().deleteAllCookies();
		//driver.manage().deleteCookieNamed("sessionKey");
		driver.get("https://www.google.co.in");
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(src,new File("C:\\Users\\rahul\\screenshot.png"));

	}

}
