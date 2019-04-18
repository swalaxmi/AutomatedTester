package automationFramework;

import java.awt.dnd.DragGestureRecognizer;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ComposteActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E://Chrome Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		WebElement logo = driver.findElement(By.xpath("//*[@id='desktop-header-cnt']/div[2]/div[1]/a"));
		Actions a = new Actions(driver);
		// right click
		//a.contextClick(logo).build().perform();
		//double click
		//a.doubleClick(logo).build().perform();
		WebElement searchfield = driver.findElement(By.xpath("//*[@id='desktop-header-cnt']/div[2]/div[3]/input"));
		// to enter capital letters into the text field
		a.keyDown(searchfield, Keys.SHIFT).sendKeys("saree").build().perform();
		
	}

}
