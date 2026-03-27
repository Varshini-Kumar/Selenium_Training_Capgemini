package Demo;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class LoginUsingXmlOR {
@Test
public void login() throws ParserConfigurationException, SAXException, IOException {
	//read data from xml
Document file =	DocumentBuilderFactory.newInstance().newDocumentBuilder()
	.parse(new File("./src/main/resources/DemoObjectRepository/LoginPage.xml"));
//fetching the string value
String username =file.getElementsByTagName("UsernameField").item(0).getTextContent();
String password =file.getElementsByTagName("PasswordField").item(0).getTextContent();
String loginbtn =file.getElementsByTagName("loginButton").item(0).getTextContent();

//splitting the locator and value
 String userloc =username.split(":")[0];
  String userlocvalue = username.split(":")[1];
	
  String passloc =password.split(":")[0];
  String passlocvalue = password.split(":")[1];
  
  
  String loginloc =loginbtn.split(":")[0];
  String loginlocvalue = loginbtn.split(":")[1];
  
  
    WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php");
	
//username
	if(userloc.equals("name")) {
		driver.findElement(By.name(userlocvalue)).sendKeys("Admin");
		
	}
	//password
	if(passloc.equals("name")) {
		driver.findElement(By.name(passlocvalue)).sendKeys("admin123");
		}
	//login button
	if(loginloc.equals("css")) {
		driver.findElement(By.cssSelector(loginlocvalue)).click();
	}
  
	
}
}
