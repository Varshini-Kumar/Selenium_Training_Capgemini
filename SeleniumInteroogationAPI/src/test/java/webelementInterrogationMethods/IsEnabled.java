package webelementInterrogationMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

driver.manage().window().maximize();
driver.get("https://www.shoppersstack.com/products_page/34");
Thread.sleep(10000);
WebElement checkbtn=driver.findElement(By.id("Check"));
//verifying if the button is enabled
System.out.println("is my check button enabled: " + checkbtn.isEnabled());
	}

}
