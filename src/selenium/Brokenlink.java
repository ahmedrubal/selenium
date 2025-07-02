package selenium;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Brokenlink {
	public static void main(String[] args) throws IOException{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.deadlinkcity.com/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		int brokenLink =0; 
		
		for (WebElement element : links) {
			String url = element.getAttribute("href");
			
			if(url==null || url.isEmpty()) {
				System.out.println("Url is empty");
				continue;
				}
			
			URL link = new URL(url);
			try {
				HttpURLConnection conn = (HttpURLConnection)link.openConnection();
				conn.connect();
				if(conn.getResponseCode()>=400) {
					System.out.println(conn.getResponseCode() + url + "  is"+ " Broken link");
					brokenLink++;
				}else {
					System.out.println(conn.getResponseCode() + url + "  is" +" Valid link");
				}
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
           
				}
		System.out.println("Nuber of broken link"+ " " +brokenLink);
		driver.quit();
		}

}
