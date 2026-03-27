package handlingsSeleniumPopups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraChildWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		Thread.sleep(2000);
		//searching dresses on the searchbox
		WebElement searchbox = driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
		searchbox.sendKeys("dresses");
		Thread.sleep(1000);
		//click the search button
		WebElement searchbtn = driver.findElement(By.xpath("//a[@class='desktop-submit']"));
		searchbtn.click();
		Thread.sleep(2000);
		//click the first product that is displayed
		driver.findElement(By.xpath("//img[@title='Marks & Spencer Girls Tie-Dye Printed Fit & Flare Dress']")).click();
		String parent = driver.getWindowHandle();
		Set<String> allwindowId = driver.getWindowHandles();
		allwindowId.remove(parent);
		for (String childId : allwindowId) {
			// switching the tool control to the child window popup
			driver.switchTo().window(childId);
		}
		//add to wishlist
		driver.findElement(By.xpath("//span[@class='myntraweb-sprite pdp-notWishlistedIcon sprites-notWishlisted pdp-flex pdp-center ']")).click();
		Thread.sleep(2000);
		//verify whether the signup page is 
		WebElement signuptextbox = driver.findElement(By.xpath("//input[@type='tel']"));
		if(signuptextbox.isDisplayed()) {
			System.out.println("Test case passed");
		}
		else {
			System.out.println("failed");
		}
	}

}
