package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class XpathByTextFunction {

	public static void main(String[] args) throws InterruptedException {
   WebDriver driver = new EdgeDriver();
   driver.get("https://demoapps.qspiders.com/ui?scenario=1");
   Thread.sleep(2000);
   driver.findElement(By.xpath("//section[.='X Path']")).click();
   Thread.sleep(1000);
   //login 3.0
   driver.findElement(By.xpath("//section[.='Login 3.0']")).click();
	}

}
