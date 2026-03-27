package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
/*driver.get("https://demowebshop.tricentis.com/");
Thread.sleep(2000);
driver.findElement(By.partialLinkText("Comp")).click();*/

driver.get("https://www.flipkart.com/");
Thread.sleep(2000);
driver.findElement(By.xpath("//span[text()='✕'"));
//driver.findElement(By.partialLinkText("Login")).click();
	}

}
