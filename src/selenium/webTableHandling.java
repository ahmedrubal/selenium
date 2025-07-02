package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webTableHandling {
	 public static WebDriver driver;
	public static void main(String[]args){
		WebDriverManager.chromedriver().setup();
	   	WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> info = driver.findElements(By.xpath("(//tbody )[2] /tr/td[4]"));
		int sum = 0; 
		for(int i =0; i<info.size();i++) {
			String n = driver.findElements(By.xpath("(//tbody )[2] /tr/td[4]")).get(i).getText();
			//String txt =info.get(i).getText();
			int total = Integer.parseInt(n);
			sum=sum+total;
		}System.out.println(sum);
//		JavascriptExecutor js =  (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,500)");
//		List<WebElement> values = driver.findElements(By.xpath("//td[4]"));
//		int sum = 0;
//		for(int i=0; i<values.size()-1; i++) {
////			System.out.println(values.get(i).getText());
//			  sum = sum+Integer.parseInt(values.get(i).getText());
//			System.out.println(sum);
//		}
//		String totalAmount = driver.findElement(By.xpath("//div[@class='totalAmount']")).getText();
//		System.out.println(totalAmount);
//		int splitedValue = Integer.parseInt(totalAmount.split(":")[1].trim());
//		System.out.println(splitedValue);
		driver.close();
		
}
}