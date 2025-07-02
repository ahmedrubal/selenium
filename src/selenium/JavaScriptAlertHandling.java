package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptAlertHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		WebElement jsAlert = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		Thread.sleep(3000);
		jsAlert.click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		WebElement jsConfirm = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
		
		jsConfirm.click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		WebElement jsPrompt = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
		jsPrompt.click();
		Alert alertWindow = driver.switchTo().alert();
		Thread.sleep(3000);
		String textOfAlert = alertWindow.getText();
		System.out.println(textOfAlert);
		Thread.sleep(3000);
		alertWindow.sendKeys("input field");
		Thread.sleep(5000);
		alertWindow.accept();
		driver.close();

	}
	}