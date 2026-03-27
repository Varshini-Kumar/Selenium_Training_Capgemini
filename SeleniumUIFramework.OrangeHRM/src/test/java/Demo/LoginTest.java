package Demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.orangehrm.seleniumuiframework.object_repository.LoginPage;

public class LoginTest {
WebDriver driver;
FileInputStream file;
Properties prop;
String Browser;
@Test
public void commonlogin() throws IOException {
	file = new FileInputStream("./src/test/resources/OrangeHrm_Common_Data/common_data_properties.properties");
	prop = new Properties();
	prop.load(file);
	Browser = prop.getProperty("browser");
	if (Browser.contains("chrome")) {
		driver = new ChromeDriver();
	} else if (Browser.contains("edge")) {
		driver = new EdgeDriver();
	} else if (Browser.contains("firefox")) {
		driver = new FirefoxDriver();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	String URL = prop.getProperty("url");
	String Browser = prop.getProperty("browser");
	String ValidUserName = prop.getProperty("username");
	String ValidPassword = prop.getProperty("password");

	// login
	driver.get(URL);
	LoginPage lp = new LoginPage(driver);
	lp.login(ValidUserName, ValidPassword);
}
}
