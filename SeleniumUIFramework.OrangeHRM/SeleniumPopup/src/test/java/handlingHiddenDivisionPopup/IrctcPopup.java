package handlingHiddenDivisionPopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IrctcPopup {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		//disable notifications
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		//navigate to IRCTC website
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//click ok on the popup
		driver.findElement(By.xpath("//button[@type=\"submit\" and @class=\"btn btn-primary\"]")).click();
		//locating the calendar dropdown and click
		WebElement calendar = driver.findElement(By.xpath("//input[@class='ng-tns-c69-9 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']"));
		calendar.click();
		//select the date
		driver.findElement(By.xpath("//a[.='11']")).click();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
