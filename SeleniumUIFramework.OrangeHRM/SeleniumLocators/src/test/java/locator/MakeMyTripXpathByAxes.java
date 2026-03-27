package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MakeMyTripXpathByAxes {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new FirefoxDriver();
driver.get("https://www.makemytrip.com/");
Thread.sleep(2000);
driver.findElement(By.xpath("//p[.='For Your Dream Europe Trip: Get Up to 40%OFF*']/../../..//a")).click();
/*in the above example i used surroundins,axes learn and do it here*/
//p[.='For Your Dream Europe Trip: Get Up to 40%OFF*']/parent::div/parent::div/following-sibling::div/child::div/child::a
	}

}
