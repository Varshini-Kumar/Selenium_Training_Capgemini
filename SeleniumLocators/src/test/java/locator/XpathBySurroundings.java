package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class XpathBySurroundings {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new EdgeDriver();
/*driver.get("https://demowebshop.tricentis.com/");
Thread.sleep(2000);
driver.findElement(By.xpath("//a[.='Build your own computer']/../..//input[@value='Add to cart']")).click();*/
	
driver.get("https://demoapps.qspiders.com/ui/duplicate?sublist=0&scenario=1");
Thread.sleep(2000);
driver.findElement(By.xpath("//label[.='Samsung'] /..//input[@type='checkbox']")).click();
driver.findElement(By.xpath("//label[.=' RedMi ']/..//input[@type='checkbox']")).click();
	
	}

}
