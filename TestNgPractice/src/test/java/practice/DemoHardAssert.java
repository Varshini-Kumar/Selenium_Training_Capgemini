package practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoHardAssert {
	@Test
	public void testMethod() {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		String expectedTitle = "Google";
		String actualTitle = driver.getTitle();
		// Hard Assertion
		//Assert.assertEquals(actualTitle, expectedTitle);
		//Assert.assertTrue(expectedTitle.equals(actualTitle),"comapring the title");
		Assert.assertEquals(expectedTitle.equals(actualTitle), true);

	}
}
