package selenium;

import java.io.File;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileDownloadingUsingAutoIt {

	public static void main(String[] args) throws Exception {
    String downloadPath = System.getProperty("user.dir");
	WebDriver driver; 
	System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
   
  
    ChromeOptions options = new ChromeOptions();

    Map<String, Object> prefs = new HashMap<String, Object>();

    prefs.put("download.default_directory", downloadPath);

    options.setExperimentalOption("prefs", prefs);
   
    driver = new ChromeDriver(options); 
    driver.manage().window().maximize(); 
	driver.get("https://convertio.co/txt-jpg/");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//button[@class='btn-cancel']")).click();
	//driver.findElement(By.xpath("//button[@id='dropzoneInput-label']")).click();
	driver.findElement(By.xpath("(//span[text()='Choose Files'])[1]")).click();
	Thread.sleep(4000);
	Runtime.getRuntime().exec("C:\\Users\\Rubal Ahmed\\Documents\\Auto Practice\\FileUpload.exe");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//button[@class='btn btn-xl btn-primary']")).click();
	Thread.sleep(20000);
	 WebElement down = driver.findElement(By.xpath("//a[text()='Download']"));
	WebDriverWait wait = new WebDriverWait(driver, 60);
	wait.until(ExpectedConditions.visibilityOf(down));
	down.click();
	File f = new File(downloadPath);
	if(f.exists()) {
		System.out.println("file is downloded");

		if(f.delete()) {
			System.out.println("file is removed");
		}
	}
	System.out.println("Test is completed");
	

	}

}
