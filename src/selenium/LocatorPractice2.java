package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LocatorPractice2 {
	
   //This method created to get password dynamically from reset login error text then using this on password field
	
	public static String getPassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		Thread.sleep(3000);
		String resetErrorText = driver.findElement(By.cssSelector("form p")).getText();
		System.out.println(resetErrorText);
		String[] splitedMessage = resetErrorText.split("'");
		String[] password = splitedMessage[1].split("'");
		String passwordValue = password[0];
		return passwordValue;

	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;

		String name = "Sam";

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		//This is coming from above method and stored it into password variable 
		String password = getPassword(driver);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		System.out.println(driver.getTitle());

		// Find Element using id and name attribute.

		driver.findElement(By.id("inputUsername")).sendKeys(name);
		
		// Here is used password variable to dynamically pass value of it
		driver.findElement(By.name("inputPassword")).sendKeys(password);

		// Find Element using className Syntax.

		driver.findElement(By.className("signInBtn")).click();

		// Find Element using TagName

		Thread.sleep(3000);
		String successfullyLoginMessage = driver.findElement(By.tagName("p")).getText();
		System.out.println(successfullyLoginMessage);

		// Driving dynamic name for userName using variable name
		// Parent to child locating syntax using xapth

		String userInput = driver.findElement(By.xpath("//div[@class='login-container']/h2")).getText();
		System.out.println(userInput);
		// validation text
		Assert.assertEquals(successfullyLoginMessage, "You are successfully logged in.");
		Assert.assertEquals(userInput, "Hello " + name + ",");

		// Find element using xPath with text syntax
		driver.findElement(By.xpath("//button[text()='Log Out']"));

		driver.close();

	}

}
