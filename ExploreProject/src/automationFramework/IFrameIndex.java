package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameIndex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E://Chrome Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);
		/*for(int i =0; i<size; i++){
			driver.switchTo().frame(i);
			int correctindex = driver.findElements(By.xpath("/html/body/a/img")).size();
			System.out.println(correctindex);
			//driver.switchTo().defaultContent();
			driver.switchTo().parentFrame();
		}*/
		
		driver.switchTo().frame(3);
		driver.findElement(By.xpath("/html/body/a/img")).click();
		size = driver.findElements(By.tagName("iframe")).size();
		System.out.println("inner frames"+size);
		//driver.switchTo().defaultContent();
	}

}
