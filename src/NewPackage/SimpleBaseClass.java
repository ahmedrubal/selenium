package NewPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

import org.testng.annotations.BeforeSuite;


public class SimpleBaseClass {
	public static WebDriver driver;
	@BeforeSuite
	public static void openDriver() {
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}
	@AfterSuite
	public static void closeDriver() {
		driver.close();
	}

}
