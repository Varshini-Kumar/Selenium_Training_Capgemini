package webdriverInterrogationMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleVerification {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
driver.get("https://demowebshop.tricentis.com/");
Thread.sleep(2000);
//fetching the title
String Expectedtitle = "Demo Web Shop";
String title = driver.getTitle();
if(title.equals(Expectedtitle)) {
	System.out.println("the navigation is sucessful");
}
else {
	System.out.println("navigation failed");
}
driver.quit();


	}

}
