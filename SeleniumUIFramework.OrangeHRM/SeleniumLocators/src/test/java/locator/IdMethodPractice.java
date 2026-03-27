package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class IdMethodPractice {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new EdgeDriver();
   /* driver.get("https://www.facebook.com/");
    Thread.sleep(2000);
    driver.findElement(By.id("_R_1h6kqsqppb6amH1_")).sendKeys("varshini123@gmail.com");
    
    driver.get("https://www.linkedin.com/login");
    Thread.sleep(2000);
    driver.findElement(By.id("username")).sendKeys("user1name");
    driver.findElement(By.id("password")).sendKeys("user1123");*/
    
    /*driver.get("https://www.netflix.com/in/login/");
    Thread.sleep(2000);
    driver.findElement(By.id(":r0:")).sendKeys("9345998609");*/
    
    
   /* driver.get("https://www.amazon.in/");
    Thread.sleep(2000);
    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("kurti");
    driver.findElement(By.id("nav-search-submit-button")).click();*/
    
  /*  driver.get("https://www.swiggy.com/");
    Thread.sleep(2000);
    driver.findElement(By.id("location")).sendKeys("kanchipuram");*/
    
  /*  driver.get("https://www.saucedemo.com/");
    Thread.sleep(2000);
    driver.findElement(By.id("user-name")).sendKeys("standard_user");
    driver.findElement(By.id("password")).sendKeys("secret_sauce");
    driver.findElement(By.id("login-button")).click();*/
    
    driver.get("https://demoqa.com/text-box");
    Thread.sleep(2000);
    driver.findElement(By.id("userName")).sendKeys("varshini");
    
   driver.get("https://practicetestautomation.com/practice-test-login/");
   Thread.sleep(2000);
   driver.findElement(By.id("username")).sendKeys("student");
   driver.findElement(By.id("password")).sendKeys("Password123");
   driver.findElement(By.id("submit")).click();
    

    
    
    
    
	}

}
