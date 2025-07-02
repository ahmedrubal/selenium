package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorPractice3 {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println(driver.getTitle());
		
		// Parent to child //header/div/button [1] and then sibling to sibling /following-sibling::button[1] syntax
		
		String text = driver.findElement(By.xpath("//header/div/button [1]/following-sibling::button[1]")).getText();
         System.out.println(text);
         
         //This is parent to child //header/div/button [1] then move to parent again /parent::div then move to child 
         //again from parent
         System.out.println(driver.findElement(By.xpath("//header/div/button [1]/parent::div/button[2]")).getText());
	}

}
