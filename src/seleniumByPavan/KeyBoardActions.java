package seleniumByPavan;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardActions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver; 
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/key_presses");
		Actions action = new Actions(driver);
		Thread.sleep(3000);
		action.sendKeys(Keys.CONTROL).build().perform();
		Thread.sleep(3000);
		action.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(3000);
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(3000);
		action.sendKeys(Keys.ARROW_UP).build().perform();
		

	}

}
