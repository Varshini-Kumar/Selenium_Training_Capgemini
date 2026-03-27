package webelementInterrogationMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValue {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.selenium.dev/");
		Thread.sleep(4000);
		WebElement logo = driver.findElement(By.xpath("//*[name()='svg' and @id='Layer_1']  "));
//logo.click();
		System.out.println(logo.getCssValue("font-family"));
		System.out.println(logo.getCssValue("color"));
		System.out.println(logo.getCssValue("backround-color"));
		System.out.println(logo.getCssValue("display"));

	}

}
