package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class RadioButton {
	 public static WebDriver driver;
	public static void main(String[]args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		//This is a single webElement and selecting them using unique xPath
		WebElement radio1 = driver.findElement(By.xpath("//input[@value='radio1']"));
		radio1.click();
				
		Thread.sleep(5000);
		
		//Here i am looping  through all element using common xPath and selecting using index number
		
		List<WebElement> radioButtons = driver.findElements(By.xpath("//input[@class='radioButton']"));
		System.out.println(radioButtons.size());
	for(int i = 0; i<radioButtons.size(); i++) {
		radioButtons.get(2).click();
	
	}
	
		
		}
}

