package NewPackage;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		 	
		System.setProperty("webdriver.chrome.driver","C:\\workspace\\Automationproject\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		WebElement blink =driver.findElement(By.className("blinkingText"));
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOf(blink));
		blink.click();
		
	
		Set<String> windows =driver.getWindowHandles();
		Iterator<String> it =windows.iterator();
		String parentId =it.next();
	    String childId = it.next();
	    driver.switchTo().window(childId);
	    Thread.sleep(5000);
		 
		System.out.println(driver.findElement(By.xpath("//div[@class=\"col-md-8\"]/p[2]")).getText().split("at")[1].split(" ")[1].trim());
		String userId =driver.findElement(By.xpath("//div[@class=\"col-md-8\"]/p[2]")).getText().split("at")[1].split(" ")[1].trim();
		driver.switchTo().window(parentId);
		Thread.sleep(5000);
		driver.findElement(By.id("username")).sendKeys(userId);
		driver.close();
		
	}

}
