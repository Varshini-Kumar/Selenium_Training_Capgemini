package locator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameMethod {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.google.com");
    Thread.sleep(2000);
  List<WebElement> alllinks =  driver.findElements(By.tagName("a"));
  for(WebElement link1 : alllinks) {
	  System.out.println(link1.getText());
  }
  for(WebElement link : alllinks) {
	  
	 
	  if(link.getText().contains("Store")) {
		 link.click();
		 break;
	  }
	  //System.out.println(link.getText());
  }
	}

}
