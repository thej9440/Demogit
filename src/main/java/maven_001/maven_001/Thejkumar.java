package maven_001.maven_001;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Thejkumar {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
		/*driver.findElement(By.xpath("//*[@viewBox='0 0 448 512']")).click();
		driver.findElement(By.xpath("//span[text()='Radio Button']")).click();
		driver.findElement(By.xpath("//input[@id='yesRadio']")).click();
		driver.findElement(By.xpath("//input[@id='yesRadio']")).click();
		driver.get("https://www.toolsqa.com");*/
		driver.findElement(By.xpath("(//a[text()='Demo Site'])[1]")).click();
		
		
		
		

	}

}
