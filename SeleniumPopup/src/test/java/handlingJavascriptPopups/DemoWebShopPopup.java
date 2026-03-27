package handlingJavascriptPopups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShopPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		//click on search button
        driver.findElement(By.xpath("//input[@class='button-1 search-box-button']")).click();
        //Handling the popup
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		//type computers in the search textfield
        driver.findElement(By.id("small-searchterms")).sendKeys("computer");
        //click on search button
        driver.findElement(By.xpath("//input[@class='button-1 search-box-button']")).click();
        
        
	}

}
