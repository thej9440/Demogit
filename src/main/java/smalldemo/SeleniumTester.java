package smalldemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTester {
	
	public static void main (String args[]) throws InterruptedException {
		
		String webDriverPath="C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", webDriverPath);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		
		String x1="//input[@class='gLFyf gsfi']";		
		WebElement d=driver.findElement(By.xpath(x1));
		d.sendKeys("fb");
		Thread.sleep(10000);
	d.clear();
		
		
		driver.quit();		
		
	}
                                                                                                                                                                                                                                                                                                                                
}
