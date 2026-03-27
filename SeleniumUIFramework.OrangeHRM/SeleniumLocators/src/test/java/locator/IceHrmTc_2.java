package locator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IceHrmTc_2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//navigating to icehrm website
		driver.get("https://icehrmpro.gamonoid.com/login.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.xpath("//button[.='Log in ']")).click();
		Thread.sleep(2000);
		WebElement dashboardm= driver.findElement(By.xpath("//h4[.='Your Colleagues']"));
		//verifying dashboard website
		if(dashboardm.isDisplayed()) {
			System.out.println("dashboard is displayed");
		}
		else {
			System.out.println("dashboard is not displayed");
		}
		Thread.sleep(2000);
		WebElement empDropdown = driver.findElement(By.xpath("//span[.='Employees']"));
		empDropdown.click();
		driver.findElement(By.xpath("(//ul[@id=\"admin_Employees\"]/..//li)[1]")).click();
		driver.findElement(By.xpath("//a[.='Skills']")).click();

		driver.findElement(By.xpath("//span[.=' Add New']")).click();
		WebElement Emp_type = driver.findElement(By.id("rc_select_1"));
		if(Emp_type.isDisplayed()) {
			System.out.println("Employee Skill Popup is displayed");
		}
		else {
			System.out.println("Employee Skill Popup is not displayed");
		}
		driver.findElement(By.xpath("//span[.='Cancel']")).click();
		driver.findElement(By.xpath("//span[.='IceHrm ']")).click();
		driver.findElement(By.xpath("//a[.='Sign out']")).click();
		//Emp_type.click();
		/*Emp_type.sendKeys("Lala Lamees",Keys.ENTER);
		//Emp_type.sendKeys("Mahi" , Keys.ENTER);

		driver.findElement(By.xpath("//textarea[@id = 'details']")).sendKeys("Hi,Add me!");

		driver.findElement(By.xpath("//span[. ='Save']")).click();


		//Logout
		driver.findElement(By.xpath("(//a[@data-toggle=\"dropdown\"])[3]")).click();
		driver.findElement(By.xpath("(//a[@class = 'btn btn-default btn-flat'])[2]")).click();

		driver.quit();*/


	}

}
