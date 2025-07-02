package selenium;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class MouseActionsInSelenium {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		String firstUrl = driver.getCurrentUrl();
		System.out.println(firstUrl);
		WebElement input1 = driver.findElement(By.xpath("//input[@id='autocomplete']"));
//		WebElement input2 = driver.findElement(By.xpath("//input[@id='name']"));
//		input1.sendKeys("Welcome");
//		//Thread.sleep(3000);
//		
		Actions action = new Actions(driver);
		
		
		action.keyDown(input1,Keys.SHIFT).sendKeys("apple").perform();
		Thread.sleep(5000);
	    input1.clear();
		action.keyUp(input1,Keys.SHIFT).sendKeys("apple").build().perform();
		Thread.sleep(5000);
	
		
//		action.keyUp(input1,Keys.CONTROL).build().perform();
//		Thread.sleep(3000);
//		
//		action.keyDown(input1,Keys.CONTROL).sendKeys("c");
//		action.keyUp(input1,Keys.CONTROL).build().perform();
//		Thread.sleep(3000);
//		
//		action.keyDown(input2,Keys.CONTROL).sendKeys("v").build().perform();
//		action.keyUp(input2, Keys.CONTROL).build().perform();
//		//Thread.sleep(3000);
		
//		WebElement tab = driver.findElement(By.linkText("Open Tab"));
//		Actions act = new Actions(driver);
//		act.sendKeys(tab,Keys.ENTER).build().perform();
//		String url = driver.getCurrentUrl();
//		System.out.println(url);
//		Assert.assertEquals(firstUrl, url);
		
		//driver.quit();
		
	}

}
