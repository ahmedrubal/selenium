package selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadUsingAutoIt {

	public static void main(String[] args) throws InterruptedException, IOException {
	WebDriver driver; 
	System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(4000);
	//driver.get("https://airconvertpdftojpg.com/");
	driver.get("https://convertio.co/txt-jpg/");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//button[@class='btn-cancel']")).click();
	//driver.findElement(By.xpath("//button[@id='dropzoneInput-label']")).click();
	driver.findElement(By.xpath("(//span[text()='Choose Files'])[1]")).click();
	Thread.sleep(4000);
	Runtime.getRuntime().exec("C:\\Users\\Rubal Ahmed\\Documents\\Auto Practice\\FileUpload.exe");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//button[@class='btn btn-xl btn-primary']")).click();
	driver.findElement(By.xpath("//a[text()='Download']")).click();
			
	
	
	

	}

}
