package selenium;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ScroolingInSelenium {
	public static void main(String[]args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		//WebPage scrolling 
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		
		Thread.sleep(5000);
		//webTable scrolling or any element we need to scroll inside webPage.
		//we have to pass cssSelector to select entire element here i used class attribute as a cssSelector(.tableFixHead)
		js.executeScript("document.querySelector(\'.tableFixHead\').scrollTop=500");
		

		
	}

}
