package seleniumWait;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningImplicitWait {

	public static void main(String[] args) {
		  WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	      driver.get("https://demowebshop.tricentis.com/");
	      String parentId = driver.getWindowHandle();
           
	      driver.findElement(By.linkText("Facebook")).click();
	      Set<String>AllIds1 = driver.getWindowHandles();
	      String FbId = "";
	      AllIds1.remove(parentId);
	      for(String str : AllIds1) {
	    	  FbId += str;
	      }
	      driver.findElement(By.linkText("Twitter")).click();
	      
	      driver.findElement(By.linkText("YouTube")).click();
	      
	}

}
