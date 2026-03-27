package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class XpathContains {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new EdgeDriver();
driver.get("https://demowebshop.tricentis.com/");
Thread.sleep(2000);
driver.findElement(By.xpath("//span[contains(.,'Shopping cart')]")).click();
	}

}
