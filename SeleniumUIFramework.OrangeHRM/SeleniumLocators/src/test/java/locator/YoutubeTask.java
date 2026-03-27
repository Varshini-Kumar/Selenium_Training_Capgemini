package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeTask {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.get("https://www.youtube.com/");
driver.findElement(By.cssSelector("[name='search_query']")).sendKeys("perfect");
driver.findElement(By.cssSelector("[title='Search']")).click();

	}

}
