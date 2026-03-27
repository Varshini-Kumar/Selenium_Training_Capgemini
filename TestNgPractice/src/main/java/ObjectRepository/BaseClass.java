package ObjectRepository;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public WebDriver driver;
@BeforeClass
public void BeforeClass() {
	ChromeOptions opt = new ChromeOptions();
	opt.addArguments("--incognito");
	driver = new ChromeDriver(opt);
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.saucedemo.com/");
}
}
