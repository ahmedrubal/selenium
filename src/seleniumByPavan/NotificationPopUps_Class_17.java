package seleniumByPavan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NotificationPopUps_Class_17 {
	/*
	 * Notifications PopUps or Permission PopUps
	 * Must configure with Browser level using ChromeOptions Class
	 * And option.addArguments("--disable-notifications");
	 * Pass option object through ChromeDriver();
	 * 
	 */

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");// Must add this Arguments
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		WebElement input_Field =driver.findElement(By.xpath("//input[@id='src' and @class='db']"));
        input_Field.sendKeys("India");    
	}

}
