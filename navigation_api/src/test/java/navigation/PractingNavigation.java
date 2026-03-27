package navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractingNavigation {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();

//Navigate to google
driver.get("https://www.google.com/");
Thread.sleep(2000);
//writing "automation" in search
driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("automation");

//navigate to amazon
driver.navigate().to("https://www.amazon.in/");
Thread.sleep(2000);
//write tools in search
driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("tools");

//refresh the page
driver.navigate().refresh();
Thread.sleep(2000);
//refresh the page
System.out.println(driver.getTitle());
//navigate back verify title
driver.navigate().back();
System.out.println(driver.getTitle());



	}

}
