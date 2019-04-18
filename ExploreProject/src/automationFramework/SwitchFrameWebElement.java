package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SwitchFrameWebElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E://Chrome Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='a077aa5e']")));
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//*[@id='nav-logo']/a[1]/span[1]"))).build().perform();
		
	}

}
