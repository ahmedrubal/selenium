package selenium;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsPractice1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		System.out.println(driver.getTitle());
		
		//Find Element using id and name attribute.
		
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("shetty");
		
		//Find Element using className Syntax.
		
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(3000);
		
		//CssSelector Syntax using tagName and Class Attribute.
		
		String text = driver.findElement(By.cssSelector("p.error")).getText();
		Thread.sleep(3000);
		System.out.println(text);
				
		//Find Element using linkText
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		// Xpath Practice Starting from here .
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Rahul");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("Rahul@rsa.com");
		Thread.sleep(3000);
		
		//xpath using indexing
		
		driver.findElement(By.xpath("//input[@type='text'] [2]")).clear();
		
		//Css Selectors using indexing 
		//Syntax to check cssselector with developer tool using console for indexing 
		//$('input[type="text"]:nth-child(3)')
		
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com");
		
		//Find Element using parent child using tag name
		
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("1 347 543 5890");
		
		//cssSelector using tagName and Class Attribute.
		
		 driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		 Thread.sleep(3000);
		 
		 //using cssSelector find element using  parent child syntax.
		
		 String resetErrorText = driver.findElement(By.cssSelector("form p")).getText();
		 System.out.println(resetErrorText);
		 
 //Customize XPath using parent(//div[@class='forgot-pwd-btn-conainer']) + child(/button) + indexing[1]
		 
		 driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer'] /button[1]")).click();
		 
		 //cssSelector by using id attribute.
		 
		 driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
		 
		 // Find element using cssSelector with regular expression.
		 
		 driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		 Thread.sleep(3000);
		 
		 driver.findElement(By.id("chkboxOne")).click();
		 
		 //Regular expression using XPath for dynamic element 
		 
		 driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		 
		 
		 
		
		 
		 
		
		
		
		

	}

}
