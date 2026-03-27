package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class XpathByTextFunctionPractice {

	public static void main(String[] args) throws InterruptedException {
     WebDriver driver = new EdgeDriver();
     driver.get("https://www.google.com/");
     Thread.sleep(2000);
     driver.findElement(By.xpath("//a[text()='Gmail']")).click();
     driver.findElement(By.xpath("//a[.='Images']")).click();
	}

}
