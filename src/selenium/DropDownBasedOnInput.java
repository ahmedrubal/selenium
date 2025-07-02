package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class DropDownBasedOnInput {
	public static void main(String[]args) throws InterruptedException{
	    WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		Thread.sleep(5000);
		
		WebElement textField = driver.findElement(By.xpath("//input[@type='text']"));
		textField.sendKeys("am");
		Thread.sleep(5000);
		
		//Here we are getting the options available after sending input 
		
		List<WebElement> options = driver.findElements(By.xpath("//ul[@class='ui-menu ui-widget ui-widget-content ui-autocomplete ui-front']/li"));
        for(int i =0; i<options.size(); i++) {
        	String option = options.get(i).getText();
        	System.out.println(option);
        			
        }
        driver.close();
}
}
