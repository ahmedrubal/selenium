package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		String childTitle = driver.getTitle();
		System.out.println(childTitle);
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> wi = windows.iterator();
		String parentId =wi.next();
		System.out.println("**Parent id is**"+ parentId);
		
		String childId = wi.next();
		System.out.println("**Child id is**"+ childId);
		if(parentId!=childId) {
			driver.switchTo().window(childId);
		}
		System.out.println(driver.findElement(By.xpath("//*[text()='Contact Sales']")).getText());;
		if(parentId.equals(childId)) {
			driver.close();
		}else {
			System.out.println("id is not eqaul");
			driver.quit();
		}
		

	}
}
