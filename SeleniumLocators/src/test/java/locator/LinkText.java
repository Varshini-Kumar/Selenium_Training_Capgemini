package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) throws InterruptedException {
     WebDriver driver = new ChromeDriver();
     driver.get("https://demowebshop.tricentis.com/");
     Thread.sleep(2000);
     driver.findElement(By.linkText("Facebook")).click();
     
     driver.get("https://www.google.com/");
     Thread.sleep(2000);
     driver.findElement(By.linkText("Gmail")).click();
	}

}
