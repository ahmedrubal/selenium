package seleniumByPavan;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlesClass_15 {

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	String WindowUrl = driver.getCurrentUrl();
	System.out.println("Parent Window Url : "+" "+WindowUrl);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	WebElement userName =driver.findElement(By.xpath("//input[@name='username']"));
	userName.sendKeys("Admin");
	WebElement passWord =driver.findElement(By.xpath("//input[@name='password']"));
	passWord.sendKeys("admin123");
	String parentWindowtitle =driver.getTitle();
	System.out.println("Parent Window Title : "+" "+parentWindowtitle);
	
	// Get Single Window ID
	/*String parentWindowId = driver.getWindowHandle();
	System.out.println("Parent Window ID : "+""+ parentWindowId);*/
	
	WebElement newWindowlink = driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']"));
	newWindowlink.click();
	Thread.sleep(4000);
	// We Can use For Each loop just to collect Title and Url For EveryPage 
	Set<String> windows =driver.getWindowHandles();
	for(String w:windows) {
		String collectsTitleOfAllPages =driver.switchTo().window(w).getTitle();
		System.out.println("Every Pages Title : "+ " "+collectsTitleOfAllPages);
		String collectsUrlOfAllPages =driver.switchTo().window(w).getCurrentUrl();
		System.out.println("Every Pages Url : "+ " "+collectsUrlOfAllPages);
	}
	
	// Handle Multiple Windows using iterator
	/*Set<String> windows =driver.getWindowHandles();
	Iterator<String> window =windows.iterator();
	String parentWindowID = window.next();
	String childWindowID =  window.next();*/
	
	// Handle Multiple Windows using ArrayList
	//Set<String> windows =driver.getWindowHandles();
	ArrayList<String> list = new ArrayList<>(windows);//Converting Set to List
	String parentWindowID =list.get(0);
	String childWindowID =list.get(1);
	
	driver.switchTo().window(childWindowID);

	String childWindowTitle = driver.getTitle();
	System.out.println(childWindowTitle);
	String childWindowUrl = driver.getCurrentUrl();
	System.out.println("New Window Url  :"+" "+childWindowUrl);
	WebElement childWinElement =driver.findElement(By.xpath("//a[text()='Platform']"));
	System.out.println("Text From New Window  : "+ " "+childWinElement.getText());
	if(childWindowUrl.equals("https://www.orangehrm.com/")) {
		System.out.println("it is matched");
	}else {
		System.out.println("it is not matched");
	}
	
	driver.switchTo().window(parentWindowID);// Returning to Parent Window Page
	Thread.sleep(5000);
	WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
	loginButton.click(); // Clicking on Login Button on Parent Window Page
	
	// Diffrence Between close() and quit() method
//	driver.close(); // close() will close current window which driver is pining
//	driver.quit(); // close all the window
	
	// How to close Specific driver window by user choice
	for(String w:windows) {
		String titles =driver.switchTo().window(w).getTitle();
		if(titles.equals("OrangeHRM"))
			driver.close();
	}
	
	
	

	}

}
