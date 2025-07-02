package seleniumByPavan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowAuthenticationPopUp_Class_17 {
	/*
	 * How to handle Authentication PopUps ?
	 * It is must passed with after https://userName:passWord @Url of application 
	 */

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Thread.sleep(5000);
		// Syntax : https://userName:passWord@Url
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		Thread.sleep(5000);
		String text = driver.findElement(By.tagName("p")).getText();
		System.out.println(text);

	}

}
