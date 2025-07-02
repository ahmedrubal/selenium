package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframes {
	public static void main(String[]args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.switchTo().frame("packageListFrame"); // First Frame
		driver.findElement(By.xpath("//a[text()='org.openqa.selenium'] [1]")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		
		driver.switchTo().frame("packageFrame"); // Second frame
		WebElement ele =driver.findElement(By.xpath("//span[text()='Alert']"));
		ele.click();
	
//		driver.switchTo().defaultContent();
		Thread.sleep(5000);
//		
//		driver.switchTo().frame("classFrame"); // Third Frame
//		String text = driver.findElement(By.xpath("//h2[@title='Interface Alert']")).getText();
//		System.out.println(text);
//		driver.close();
	}
}

