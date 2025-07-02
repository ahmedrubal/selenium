package seleniumByPavan;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicWebTableWithPagination_Class21 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/admin/index.php?route=common/dashboard&user_token=3a5a2ad6d0d344ff4834e6266ee00be6");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='input-username']")).sendKeys("demo");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("demo");
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Thread.sleep(5000);
		
//		WebElement warningAlert =driver.findElement(By.xpath("//button[@class='btn-close']"));
//		//Alert alert = driver.switchTo().alert();
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		jse.executeScript("arguments[0].click;", warningAlert);
		WebElement sales =driver.findElement(By.xpath("//li[@id='menu-sale']/a"));
		sales.click();
		
		

	}

}
