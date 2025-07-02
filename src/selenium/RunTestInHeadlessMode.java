package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class RunTestInHeadlessMode {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		// TO RUN TEST IN HEADLESS MODE setHeadless and addArguments both method will work
		// option.setHeadless(true);
		option.addArguments("--headless");
		//getBrowserName method used to get Browser name
		String name = option.getBrowserName();
		System.out.println(name);
		
		WebDriver driver = new ChromeDriver(option);

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.getTitle());
		WebElement text = driver.findElement(By.xpath("//h1[text()='Practice Page']"));
		System.out.println(text.getText());
		Assert.assertEquals(true, true);

		driver.close();
		driver.quit();
		System.out.println("Test is completed");

	}

}
