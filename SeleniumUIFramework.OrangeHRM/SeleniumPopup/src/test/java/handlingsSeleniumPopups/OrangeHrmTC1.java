package handlingsSeleniumPopups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmTC1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(4000);
		WebElement orangehrm = driver.findElement(By.xpath("//a[.='OrangeHRM, Inc']"));
		orangehrm.click();
		String parent = driver.getWindowHandle();
		Set<String> allwindowId = driver.getWindowHandles();
		allwindowId.remove(parent);
		for (String childId : allwindowId) {
			// switching the tool control to the child window popup
			driver.switchTo().window(childId);
		}
		if (driver.getCurrentUrl().contains("https://www.orangehrm.com/")) {
			System.out.println("Url is verified");
		} else {
			System.out.println("Incorrect URL");
		}
		String pagetitle = driver.getTitle();
		if (pagetitle.isEmpty()) {
			System.out.println("The page title is empty");

		} else {
			System.out.println("the page title is present");
		}
		driver.close();
		driver.switchTo().window(parent);
		WebElement loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		if (loginbutton.isDisplayed()) {
			System.out.println("Login page is displayed");
		} else {
			System.out.println("not displayed");
		}
		driver.quit();

	}

}
