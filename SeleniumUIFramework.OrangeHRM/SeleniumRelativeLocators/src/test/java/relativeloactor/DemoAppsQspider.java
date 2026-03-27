package relativeloactor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class DemoAppsQspider {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new EdgeDriver();
driver.get("https://demoapps.qspiders.com/ui?scenario=1");
Thread.sleep(2000);
WebElement name =driver.findElement(By.xpath("//input[@id=\'name\']"));
name.sendKeys("Varshini");
 WebElement email= driver.findElement(RelativeLocator.with(By.tagName("input")).below(name));
 email.sendKeys("abad@gmail.com");
 WebElement password = driver.findElement(RelativeLocator.with(By.tagName("input")).below(email));
 password.sendKeys("Varsh@14");
 
WebElement login = driver.findElement(By.xpath("//a[@href='/ui/login']"));
/*WebElement register = driver.findElement(RelativeLocator.with(By.tagName("a")).toRightOf(login));
register.click();*/

driver.findElement(RelativeLocator.with(By.tagName("button")).below(password)).click();
}

}
