package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NotificationPopUps {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		// ChromeOptions class is used to allow permission to browser for open a webpage
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://redbus.in/");
		

	}

}
