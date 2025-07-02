package seleniumByPavan;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestiveDropDown_Google_search {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(4000);
		String title = driver.getTitle();
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("selenium");
		Thread.sleep(4000);
		List<WebElement>items = driver.findElements(By.xpath("//div[@class='wM6W7d']//span"));
		System.out.println(items.size());
		for(WebElement option:items) {
			System.out.println(option.getText());
			if(option.getText().contains("webdriver")) {
				option.click();
				break;
			}
		}
		// Here just verifying it is clicked on Selenium Webdriver
		String titleOfWebdriverPage =  driver.getTitle();
		
		if(!title.equals(titleOfWebdriverPage)){
			System.out.println("It is clicked on selenium webdriver");
			
		}
		Thread.sleep(4000);
		
		
		driver.close();
		

	}

}
