package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    driver.get("https://demowebshop.tricentis.com/");
    Thread.sleep(2000);
    //fething the url of the current webpage
    System.out.println(driver.getCurrentUrl());
    driver.get("https://www.google.com/");
    System.out.println(driver.getCurrentUrl());
    
    System.out.println(driver.getPageSource());
   // driver.quit();
    //closing the driver controlled window
    driver.close();
	}

}
