package seleniumByPavan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigations {
	
/*
 *        NAVIGATION METHODS
 * navigate.to() Method accept two  parameters.....
 * 1 . navigate.to(String url)
 * 2. navigate.to(URL url)
 * public void to(String url){
  get(url);}//to method internally calling get method so there is no difference between to() and get()method. 
 * navigate.back();
 * navigate.forward();
 * navigate.refresh();
 */

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com");
		Thread.sleep(3000);
//		driver.get("http://www.amazon.com");
		driver.navigate().to("http://www.amazon.com");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		driver.close();

	}

}
