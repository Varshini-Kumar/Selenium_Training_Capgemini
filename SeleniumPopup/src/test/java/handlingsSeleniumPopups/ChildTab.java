package handlingsSeleniumPopups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildTab {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptops");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-index='3']")).click();
		Thread.sleep(2000);
		Set<String> allwindowId = driver.getWindowHandles();
		String parentId = driver.getWindowHandle();
		allwindowId.remove(parentId);
		for(String childId : allwindowId) {
			driver.switchTo().window(childId);
		}
		driver.findElement(By.xpath(""));
		
		
		
		
	}

}
