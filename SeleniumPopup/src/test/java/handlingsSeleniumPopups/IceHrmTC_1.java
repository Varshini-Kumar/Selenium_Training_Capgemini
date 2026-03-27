package handlingsSeleniumPopups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IceHrmTC_1 {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
//navigate to icehrm
driver.get("https://icehrmpro.gamonoid.com/login.php");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//giving invalid credentials
driver.findElement(By.id("username")).sendKeys("admin123");
driver.findElement(By.id("password")).sendKeys("admin456");
driver.findElement(By.xpath("//button[.='Log in ']")).click();

//giving valid credentials
driver.findElement(By.id("username")).sendKeys("admin");
driver.findElement(By.id("password")).sendKeys("admin");
driver.findElement(By.xpath("//button[.='Log in ']")).click();
Thread.sleep(2000);
//verifying the dashboard page is displayed
WebElement dashboardm= driver.findElement(By.xpath("//h4[.='Your Colleagues']"));
if(dashboardm.isDisplayed()) {
	System.out.println("dashboard is displayed");
}
else {
	System.out.println("dashboard is not displayed");
}
Thread.sleep(2000);
//clicking on the employee dropdown
WebElement empDropdown = driver.findElement(By.xpath("//span[.='Employees']"));
empDropdown.click();
driver.findElement(By.xpath("(//ul[@id=\"admin_Employees\"]/..//li)[1]")).click();
driver.findElement(By.xpath("//button[@class='ant-btn css-dev-only-do-not-override-240cud ant-btn-dashed ant-btn-color-default ant-btn-variant-dashed']")).click();
//department is not working
//clicking save button
driver.findElement(By.xpath("(//div[@class = 'ant-space-item']/child::button)[4]")).click();


}
	}


