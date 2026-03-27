package webelementInterrogationMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeValues {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		//locating search text field
		WebElement search = driver.findElement(By.id("small-searchterms"));
		//fetch attribute value for a static attribute
		System.out.println(search.getAttribute("id")); //id="small-searchterms"
		System.out.println(search.getDomAttribute("id"));
		System.out.println(search.getDomProperty("id"));
		
		//fetch attribute value for a dynamic attribute
		System.out.println(search.getAttribute("value")); 
		System.out.println(search.getDomAttribute("value"));
		System.out.println(search.getDomProperty("value"));
		Thread.sleep(2000);
		
		//typing mobile to change the data of value attribute
		search.sendKeys("Mobile");
		System.out.println(search.getAttribute("value")); 
		System.out.println(search.getDomAttribute("value"));
		System.out.println(search.getDomProperty("value"));
		driver.quit();
		

	}

}
