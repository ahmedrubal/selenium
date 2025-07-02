package seleniumByPavan;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardActionMultipleKeys {

	public static void main(String[] args) {
		WebDriver driver; 
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://textcompare.com/");
		WebElement input1 = driver.findElement(By.xpath("//textarea[@name='frm_compare_1']"));
		WebElement input2 = driver.findElement(By.xpath("//textarea[@name='frm_compare_2']"));
		input1.sendKeys("This is the text");
		
		Actions action = new Actions(driver);
		
		
		// CTRL + A
		action.keyDown(Keys.CONTROL);
		action.sendKeys("a");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		
		// CTRL + C
		
		action.keyDown(Keys.CONTROL);
		action.sendKeys("c");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		
		// Shift to input 2 box
		action.sendKeys(Keys.TAB);
		action.perform();
		
		// CTRL + V
		action.keyDown(Keys.CONTROL);
		action.sendKeys("v");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		
		// Here Comparing the text 
		System.out.println(input1.getAttribute("value"));
		System.out.println(input2.getAttribute("value"));
		
		if(input1.getAttribute("value").equals(input2.getAttribute("value"))) {
			System.out.println("both text are same");
		}else {
			System.out.println("Text are not same");
		}
		driver.close();
		


	}

}
