package handlingJavascriptPopups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptPopUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Alert with Text")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class='btn btn-info']")).click();
		Thread.sleep(2000);
		Alert prompt = driver.switchTo().alert();
		prompt.sendKeys("Varshini");
		Thread.sleep(2000);
		prompt.accept();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
