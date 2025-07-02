package NewPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebCalender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\workspace\\Automationproject\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,500)");
		
		List<WebElement>values = driver.findElements(By.xpath("//div[@class=\"tableFixHead\"] //td[4]"));
		Thread.sleep(5000);
		js.executeScript("document.querySelector(\'.tableFixHead\').scrollTop=500;");
		int sum=0;
		for(int i=0;i<values.size();i++) {
			sum=sum+Integer.parseInt(values.get(i).getText());
			
		}
		System.out.println(sum);
		int total=Integer.parseInt(driver.findElement(By.xpath("//div[@class=\'totalAmount\']")).getText().split(":")[1].trim());
		//System.out.println(total);
		Assert.assertEquals(sum, total);
		

	}

}
