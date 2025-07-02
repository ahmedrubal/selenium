package seleniumByPavan;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFileUsingSelenium {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.monsterindia.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@title='Click to upload your resume' and @class='btn block resume-btn btn-orange mt20']")).click();
		Thread.sleep(3000);
		WebElement ele =driver.findElement(By.xpath("(//input[@id='file-upload'])[1]"));
		
		//javaScript Executor is used to click on element because sometimes regular click method not working 
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", ele);
		
		//String selection class is used to copy file on ClipBoard 
		//Toolkit class is also used to select system ClipBoard
		StringSelection st = new StringSelection("C:\\file\\Certificate of Rubal Ahmed.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(st, null);
		
		
		Robot rb = new Robot();
		rb.delay(3000);
		//CTRL+v
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.delay(3000);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.delay(3000);
		
		//Enter key 

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		driver.close();
		
		

	}

}
