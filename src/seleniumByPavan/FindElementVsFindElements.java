package seleniumByPavan;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementVsFindElements {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.nopcommerce.com/register");
	
	// findElement() ---> Return the Single WebElement
	//1
	WebElement searchBox = driver.findElement(By.id("small-searchterms"));
	searchBox.sendKeys("xyz");
	
	//2 Even my xpath locating to multiple elements but findElement() will return only first element
	WebElement listOfLinks = driver.findElement(By.xpath("//ul[@class='list']//li//a"));
	System.out.println(listOfLinks.getText()); //Sitemap link will return among 18 of them links
	
	//3 When element not present in the WebPage findElement() will Retrun NoSuchElementException
	
//	WebElement srchBoxWrngXpath = driver.findElement(By.id("small-searchterm"));
//	srchBoxWrngXpath.clear(); // NoSuchElementException
	
	//findElements() ---> Returns multiple Web elements
	//1
	List<WebElement>list = driver.findElements(By.xpath("//ul[@class='list']//li//a"));
	System.out.println("Number of elements:  "+ list.size()); //18
	
	//2 We can use findElements() method while locator pointing to single element present in a page
	
 	List<WebElement> singleElement = driver.findElements(By.id("small-searchterms"));
	System.out.println("Single element will return: "+ singleElement.size()); //1
	
	//3 We can't do action for element present in a findElements() directly , we have to loop through it.
	
	List<WebElement>options = driver.findElements(By.xpath("//ul[@class='list']//li//a"));
	System.out.println("Number of elements:  "+ options.size()); //18
	for( WebElement option:options) {
		System.out.println("Link is ***"+ option.getText()); //it will print all 18 links text
	}
	
	//4. When none of the element present in a page findElements() not returning any Exception , it is throwing 0 element
	List<WebElement> noElementPresent = driver.findElements(By.id("small-searchterm"));
	System.out.println("Return No exception but retrun >>>> :"+noElementPresent.size()); // Return 0 element
	
	driver.close();
	
	}
	


}
