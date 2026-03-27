package webdriverInterrogationMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {

	public static void main(String[] args) throws InterruptedException {
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://demowebshop.tricentis.com/");
       Thread.sleep(2000);
       //fetching the 32 char unique session id
       System.out.println(driver.getWindowHandle());
       driver.quit();
       }

}
