package webdriverInterrogationMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CurrentUrlMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
		String expectedurl = "https://demowebshop.tricentis.com/";
		String actualurl = driver.getCurrentUrl();
		if (actualurl.equals(expectedurl)) {
			System.out.println("url is correct");
		} else {
			System.out.println("incorrect url");
		}

	}

}
