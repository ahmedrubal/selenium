package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHandleWithPagination {

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.opencart.com/admin/");
	WebElement userName = driver.findElement(By.id("input-username"));
	userName.sendKeys("demo");
	WebElement passWord = driver.findElement(By.id("input-password"));
	passWord.sendKeys("demo");
    WebElement loginBtn =  driver.findElement(By.xpath("//button[@type='submit']"));
    loginBtn.click();
    Thread.sleep(3000);
//    WebElement sales= driver.findElement(By.xpath("//li[@id='menu-sale']/a"));
//    sales.click();
//    WebElement orders = driver.findElement(By.xpath("//ul[@class='collapse show']/li[1]"));
//    orders.click();
//    Thread.sleep(5000);
	WebElement warningBtn = driver.findElement(By.xpath("//button[@class='btn-close']"));
//	warningBtn.click();
	Alert alert = driver.switchTo().alert();
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click;", warningBtn);
//	Actions action = new Actions(driver);
//	action.moveToElement(warningBtn).click().build().perform();
	
	Thread.sleep(3000);
	

	}

}
