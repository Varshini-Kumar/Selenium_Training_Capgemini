package WindowScrolling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoView {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
	WebElement video=driver.findElement(By.xpath("(//yt-touch-feedback-shape[@class='yt-spec-touch-feedback-shape yt-spec-touch-feedback-shape--touch-response'])[1]"));
	
	    
		}

}
