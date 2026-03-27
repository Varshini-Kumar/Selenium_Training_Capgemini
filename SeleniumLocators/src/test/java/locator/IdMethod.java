package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdMethod {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.google.com/");
    Thread.sleep(2000);
    //typing selenium in the search textfield
   /* WebElement search= driver.findElement(By.id("APjFqb"));
    search.sendKeys("selenium");*/
    driver.findElement(By.id("APjFqb")).sendKeys("selenium");
    
	}
	

}
