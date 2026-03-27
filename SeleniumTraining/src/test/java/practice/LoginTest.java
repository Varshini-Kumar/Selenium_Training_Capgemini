package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    WebDriver driver = new ChromeDriver();
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    Thread.sleep(3000);
    driver.findElement(By.name("username")).sendKeys("Admin");
    driver.findElement(By.name("password")).sendKeys("admin123",Keys.ENTER);
    WebElement homepage = driver.findElement(By.xpath("//h6"));
    if(homepage.isDisplayed()) {
    	System.out.println("The homepage is displayed: status- PASS");
    }
    else {
    	System.out.println("The homepage is not displayed: status- FAILED");
    }
	}

}
