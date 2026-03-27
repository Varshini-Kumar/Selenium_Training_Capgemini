package Demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginUsingPropertiesOR {
	WebDriver driver;
@Test
public void login() throws IOException, InterruptedException {
	FileInputStream fis = new FileInputStream("./src/main/resources/DemoObjectRepository/LoginPage.properties");
	Properties prop = new Properties();
	prop.load(fis);
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(2000);
	driver.findElement(By.id(prop.getProperty("un").split(":")[1])).sendKeys("Admin");
	Thread.sleep(2000);

	driver.findElement(By.cssSelector(prop.getProperty("pass").split(":")[1])).sendKeys("admin123");
	driver.findElement(By.cssSelector(prop.getProperty("loginbutton").split(":")[1])).click();
	
	
}
}
