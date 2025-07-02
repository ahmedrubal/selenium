package seleniumByPavan;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptAlertClass_17{
	/*
	 * 1. How to handle Java Script Alert ?
	 */

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
//		WebElement jsAlert =driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
//		jsAlert.click();
		
		// Alert window with ok button And Get Text of Alert . 
		
//		Alert al =driver.switchTo().alert();
//		System.out.println(al.getText());
//		Thread.sleep(4000);
//		al.accept();
		
		// Alert with OK and Cancel button . 
		/*WebElement jsConfirm = driver.findElement(By.xpath(" //button[@onclick='jsConfirm()']"));
		jsConfirm.click();
		Alert js = driver.switchTo().alert();
		System.out.println("Text With Js Confirm Alert :"+" "+js.getText());
		Thread.sleep(4000);
		//js.accept();
         js.dismiss();  
         */
		
         // Alert with  inputBox , OK and Cancel button . 
		
         WebElement jsPrompt = driver.findElement(By.xpath(" //button[text()='Click for JS Prompt']"));
         jsPrompt.click();

         Alert jsPro = driver.switchTo().alert();
         jsPro.sendKeys("Text Entered");
         Thread.sleep(5000);
         System.out.println("Text From jsPrompt : "+" "+ jsPro.getText());
         jsPro.accept();
         //jsPro.dismiss();
	}

}
