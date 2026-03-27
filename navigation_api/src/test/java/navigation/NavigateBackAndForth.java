package navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateBackAndForth {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
//Navigate to Myntra
driver.get("https://www.myntra.com/");
Thread.sleep(2000);
//navigate to bigbasket
driver.navigate().to("https://www.bigbasket.com/");
Thread.sleep(2000);
//navigate to amazon
driver.navigate().to("https://www.amazon.in/");
Thread.sleep(2000);

//Navigate to bigbasket
driver.navigate().back();
System.out.println(driver.getTitle());
Thread.sleep(2000);

//Navigate to amazon and verifying
driver.navigate().forward();
System.out.println(driver.getTitle());


	}

}
