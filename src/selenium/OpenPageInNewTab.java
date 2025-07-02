package selenium;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenPageInNewTab {
	public static void main(String[]args) {
		 WebDriver driver;
		 System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		 List<WebElement> links = driver.findElements(By.tagName("a"));
		 System.out.println(links.size());
		 WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		 List<WebElement>footerlinks = footerdriver.findElements(By.tagName("a"));
		 System.out.println(footerlinks.size());
		 WebElement columndriver = driver.findElement(By.xpath("//td//ul[1]"));
		 List<WebElement>columnlinks = columndriver.findElements(By.tagName("a"));
		 System.out.println(columnlinks.size());
				 
		 for(int i = 0; i<columnlinks.size()-2;i++) {
			 String tabOnLink = Keys.chord(Keys.CONTROL,Keys.ENTER);
			 driver.findElement(By.tagName("a")).sendKeys(tabOnLink);
			 
		 }
		 String window = driver.getWindowHandle();
		 System.out.println(driver.getTitle());
		 
		 Set<String>windows = driver.getWindowHandles();
		 Iterator<String> it = windows.iterator();
		 if(it.hasNext()) {
			 String childWindow = it.next();
			 System.out.println(childWindow);
			 if(window!=childWindow) {
				 System.out.println(driver.switchTo().window(childWindow).getTitle());
				
			 }
		 }
		

		 
	}

}
