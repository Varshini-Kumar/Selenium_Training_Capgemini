package locator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Xpathpractice3DemoWebShop {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new EdgeDriver();
    driver.get("https://demowebshop.tricentis.com/");
    Thread.sleep(2000);
    List<WebElement>allbutton = driver.findElements(By.xpath("//input[@type='radio']"));
    for(WebElement link1 : allbutton) {
  	  link1.click();
  	  //Thread.sleep(1000);
    }

    }

}
