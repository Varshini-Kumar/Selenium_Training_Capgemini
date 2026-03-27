package handlingsSeleniumPopups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingNewWindow {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.amazon.in/");
Thread.sleep(2000);
//Launching a new window and switching the tool simultaneously
driver.switchTo().newWindow(WindowType.WINDOW);
driver.get("https://www.selenium.dev/");
System.out.println(driver.getTitle());

	}

}
