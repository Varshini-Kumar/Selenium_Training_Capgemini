package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class XpathByMultipleAttribute {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new EdgeDriver();
/*driver.get("https://demowebshop.tricentis.com/");
Thread.sleep(2000);
//geting nosuch element exception
driver.findElement(By.xpath("//a[contains(.,'Digital downloads') and @href='/digital-downloads' and @class]")).click();
	*/
driver.get("https://www.ebay.com/");
Thread.sleep(2000);
driver.findElement(By.xpath("//a[@class='vl-flyout-nav__link-container' and @_sp='p4624852.m1379.l3250' and @href='https://www.ebay.com/b/Clothing-Shoes-Accessories/11450/bn_1852545' ]")).click();
	}

}
