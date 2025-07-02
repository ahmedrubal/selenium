package NewPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TravelocityEndToEnd {

	public static void main(String[] args) throws InterruptedException {
	 WebDriver driver;
	 System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.travelocity.com/");
	 System.out.println(driver.getTitle());
	 driver.findElement(By.xpath("//button[@class='uitk-faux-input']")).sendKeys("Dhaka");
	
	
	 WebElement ele = driver.findElement(By.xpath("//ul[@class='uitk-typeahead-results no-bullet']/li[4]"));
	 WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(ele));
		ele.click();
		driver.findElement(By.xpath("//button[@id='d1-btn']")).click();
		driver.findElement(By.xpath("(//tbody/tr[4]/td[4])[1]")).click();
//		//driver.findElement(By.xpath("//button[@id='d2-btn']")).click();
//		driver.findElement(By.xpath("(//tbody/tr[5]/td[3])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@data-stid='apply-date-picker']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='uitk-fake-input uitk-form-field-trigger']")).click();
		int i =6;
		while(i<=6) {
		driver.findElement(By.xpath("(//button[@class='uitk-flex-item uitk-step-input-button'])[2]")).click();
		i++;
		}
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@data-testid='add-room-button']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@data-testid='guests-done-button']")).click();
	// driver.close();

	}

}
