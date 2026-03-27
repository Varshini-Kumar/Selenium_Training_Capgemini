package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class XpathPractice1 {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new EdgeDriver();
driver.manage().window().maximize();
driver.get("https://github.com/");
Thread.sleep(3000);
driver.findElement(By.xpath("//span[@class='flex-1']")).click();
driver.findElement(By.xpath("//input[@id='query-builder-test']")).sendKeys("selenium");
Thread.sleep(2000);
driver.findElement(By.xpath("//span[@class='ActionListItem-label text-normal']")).click();
	}

}
