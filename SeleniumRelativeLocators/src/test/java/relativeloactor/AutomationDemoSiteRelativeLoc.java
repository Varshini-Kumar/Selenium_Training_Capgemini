package relativeloactor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class AutomationDemoSiteRelativeLoc {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new EdgeDriver();
driver.get("https://demo.automationtesting.in/Register.html");
Thread.sleep(2000);
WebElement firstname = driver.findElement(By.cssSelector("[placeholder='First Name']"));
firstname.sendKeys("Varsh");
WebElement lastname = driver.findElement(RelativeLocator.with(RelativeLocator.with(By.tagName("input")).toRightOf(firstname)));
lastname.sendKeys("Kumar");
driver.findElement(RelativeLocator.with(By.cssSelector("[ng-model='Adress']")).below(lastname)).sendKeys("abc street");
	}

}
