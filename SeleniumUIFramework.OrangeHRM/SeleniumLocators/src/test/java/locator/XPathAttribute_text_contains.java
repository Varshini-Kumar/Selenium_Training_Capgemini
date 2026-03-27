package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class XPathAttribute_text_contains {

	public static void main(String[] args) throws InterruptedException {

WebDriver driver = new ChromeDriver();
driver.get("https://testautomationpractice.blogspot.com/");
driver.manage().window().maximize();
// 1️ XPath using ATTRIBUTE 
driver.findElement(By.xpath("//input[@id='name']")).sendKeys("John");
driver.findElement(By.xpath("//input[@id='email']")).sendKeys("john@gmail.com");
driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("1234567890");
driver.findElement(By.xpath("//input[@id='male']")).click();
driver.findElement(By.xpath("//input[@id='sunday']")).click();

// 2️ XPath using text() 

driver.findElement(By.xpath("//label[text()='Male']")).click();
driver.findElement(By.xpath("//label[text()='Female']")).click();
driver.findElement(By.xpath("//button[text()='Submit']")).click();
driver.findElement(By.xpath("//h2[text()='Automation Practice']")).isDisplayed();
driver.findElement(By.xpath("//a[text()='Posts (Atom)']")).isDisplayed();


// 3️  XPath using contains() 
driver.findElement(By.xpath("//button[contains(@id,'alertBtn')]")).click();
driver.findElement(By.xpath("//input[contains(@id,'Wikipedia1')]")).sendKeys("Java");
driver.findElement(By.xpath("//div[contains(@class,'widget-content')]")).isDisplayed();
driver.findElement(By.xpath("//table[contains(@name,'BookTable')]")).isDisplayed();
driver.findElement(By.xpath("//a[contains(text(),'Wikipedia')]")).click();
Thread.sleep(3000);
driver.quit();

		    }

		
	}


