package WindowScrolling;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingByAndTo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);

        //Scrolling by using scroll by
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);

		js.executeScript("window.scrollBy(0,1500)");
		Thread.sleep(3000);
        //scrolling by using scroll to
		Thread.sleep(3000);
		js.executeScript("window.scrollTo(0,1000)");
		Thread.sleep(3000);

		js.executeScript("window.scrollTo(0,1500)");

	}

}
