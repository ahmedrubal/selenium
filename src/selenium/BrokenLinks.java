package selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {
	public static HttpURLConnection connection ;
	   public static  int responsecode;

	public static void main(String[] args) throws MalformedURLException, IOException {
	
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.get("http://www.deadlinkcity.com/");
    driver.manage().window().maximize();
    List<WebElement>links = driver.findElements(By.tagName("a"));
    int size = links.size();
    System.out.println(size);
    for(int i=0; i<size;i++) {
    	System.out.println(links.get(i).getText());
    	System.out.println(links.get(i).getAttribute("href"));
    }
   Iterator<WebElement> li = links.iterator();
   while(li.hasNext()) {
	   String url =li.next().getAttribute("href");
   
   connection =( HttpURLConnection) new URL("https://opensource-demo.orangehrmlive.com/").openConnection();
   connection.connect();
   connection.getResponseCode();
   if(responsecode>=400) {
	   System.out.println("Broken link"+url+"rsponsecode"+responsecode );
	   
   }else {
	   System.out.println("Not broken link present for this page");
   }
	}
   }

}
