package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demo.automationtesting.in/Register.html");
Thread.sleep(2000);
//click on skills drop down
WebElement skillsdropdown = driver.findElement(By.id("Skills"));
skillsdropdown.click();
Thread.sleep(2000);
skillsdropdown.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN
		,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);

	}

}
