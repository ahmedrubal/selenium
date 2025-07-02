package seleniumByPavan;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileDownloadUsingSelenium {
	

	public static void main(String[] args) throws InterruptedException {
		
    String location = System.getProperty("user.dir")+"\\downloads\\";
    //chrome Browser Preferences
    HashMap preference = new HashMap();
    preference.put("download.default_directory", location);
    ChromeOptions option = new ChromeOptions();
    option.setExperimentalOption("prefs", preference);
    
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver(option);
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    Thread.sleep(3000);
    driver.get("https://file-examples.com/index.php/text-files-and-archives-download/");
    Thread.sleep(3000);

    driver.findElement(By.xpath("//a[text()='Download sample CSV file']")).click();
    Thread.sleep(5000);

//    WebElement frame =driver.findElement(By.xpath("//iframe[@title='Advertisement' and @id='ad_iframe']"));
//    Thread.sleep(5000);
    Actions ac =new Actions(driver);
    ac.moveToElement( driver.findElement(By.xpath("//span[text()='Close']"))).click();
   // driver.findElement(By.xpath("//span[text()='Close']")).click();
   // driver.switchTo().frame(frame);
    
    if( driver.findElement(By.xpath("//div[@style='cursor: pointer;'] //*[@viewBox='0 0 48 48']")).isDisplayed()) {
    	ac.moveToElement(driver.findElement(By.xpath("//div[@style='cursor: pointer;'] //*[@viewBox='0 0 48 48']"))).click();
    }else {
    	   ac.moveToElement( driver.findElement(By.xpath("//span[text()='Close']"))).click();
    	}
    }
    
 

}
