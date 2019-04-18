package automationFramework;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateAndTimePicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E://Chrome Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.path2usa.com/travel-companions");
		/*driver.get("https://demos.telerik.com/kendo-ui/datetimepicker/index");
		//driver.findElement(By.linkText("Accept Cookies")).click();
		//driver.switchTo().alert().accept();
		WebElement datepicker = driver.findElement(By.xpath("//*[@id='example']/div/span/span/span[2]/span[1]/span"));
		datepicker.click(); */
		WebElement datepicker = driver.findElement(By.name("travel_date"));
		datepicker.click();
		//Selecting desired month
				WebElement selectmonth = driver.findElement(By.cssSelector("th.datepicker-switch"));
				selectmonth.click();
				List<WebElement> months = driver.findElements(By.className("month"));
				int monthcount = months.size();
				System.out.println("No. of Months:"+monthcount);
				for(int j=0; j<monthcount;j++){
					String monthname = months.get(j).getText();
					if(monthname.equalsIgnoreCase("May")){
						months.get(j).click();
						break;
					}
				}
		
		
		// Selecting desired date
		List <WebElement> dates = driver.findElements(By.className("day"));
		int count = dates.size();
		System.out.println("No. of Days:"+count);
		for(int i=0;i<count;i++){
			String text = dates.get(i).getText();
			if(text.equalsIgnoreCase("15")){
				dates.get(i).click();
				break;
			}
		}
		
		
		
	}

}
