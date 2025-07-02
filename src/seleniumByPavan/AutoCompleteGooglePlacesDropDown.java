package seleniumByPavan;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoCompleteGooglePlacesDropDown {
	/*
	 * Google Places Drop Down Which is not possible to inspect Which is auto
	 * selected after entering the desire text And it is handled by Down Arrow using
	 * keyboard Get the text must use getAttribute method This type of elements
	 * getText method wont work Also must use SendKeys method and use keys class to
	 * use keyboard functions
	 */

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.twoplugs.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		WebElement advanced = driver.findElement(By.xpath("//button[@id='details-button']"));
		advanced.click();
		WebElement proceedLink = driver.findElement(By.xpath("//a[@id='proceed-link']"));
		proceedLink.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Live Posting']")).click();
		WebElement searchBox = driver.findElement(By.xpath("//input[@id='autocomplete']"));
		searchBox.clear();
		searchBox.sendKeys("Toronto");

		String text;
		do {
			searchBox.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(3000);
			text = searchBox.getAttribute("value");
			Thread.sleep(3000);
			System.out.println("Option is Available is :" + " " + text);

			if (text.equals("Toronto, OH, USA")) {
				searchBox.sendKeys(Keys.ENTER);
				System.out.println("Expected Value is Selected:" + " " + text);
				Thread.sleep(3000);
				break;
			}
			Thread.sleep(3000);

		} while (!text.isEmpty());

		driver.close();

	}
}
