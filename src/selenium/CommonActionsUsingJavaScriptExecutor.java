
package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonActionsUsingJavaScriptExecutor {
  
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//Draw a border around an WebElement using javaScriptExecutor
		
		
//		WebElement logo = driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
//		JavaScriptUtil.drawBorder(driver, logo);
//		Thread.sleep(4000);
		
		//Get page title using JavaScriptExecutor
		
//	    String title =JavaScriptUtil.getTitleByJs(driver);
//		System.out.println(title);
		
		//click Actions using JavaScriptExecutor
		
//		WebElement Registerlink = driver.findElement(By.xpath("//a[text()='Registry']"));
//		JavaScriptUtil.clickElementByJs(driver, Registerlink);
		
       // Generate alert message using javaScriptExecutor
//		JavaScriptUtil.generateAlertByJs(driver, ".....This is java alert...");
		
		 //Refreshing an WebPage using javaScriptExecutor
		
		JavaScriptUtil.refreshPageByJs(driver);
		
		//Scroll Up using JavaScriptExecutor
		
		JavaScriptUtil.scrollUpToJs(driver);
		Thread.sleep(10000);
		
		//Scroll Down using JavaScriptExecutor
		
		JavaScriptUtil.scrollDownByJs(driver);
		//Zoom page by javaScriptExecutor
		JavaScriptUtil.zoomPageByJs(driver);
		Thread.sleep(3000);
		driver.close();
	}
      
	  
}
