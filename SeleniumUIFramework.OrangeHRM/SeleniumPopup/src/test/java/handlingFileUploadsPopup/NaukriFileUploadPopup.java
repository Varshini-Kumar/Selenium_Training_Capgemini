package handlingFileUploadsPopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriFileUploadPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Navigate to naukri.com
		driver.get("https://www.naukri.com/");
		Thread.sleep(2000);
		// click on register
		driver.findElement(By.xpath("//a[.='Register']")).click();
		// click on experienced
		driver.findElement(By.cssSelector("div[data-val='exp']")).click();
		// file upload popup
		driver.findElement(By.xpath("//input[@id='resumeUpload']")).sendKeys("C:\\Users\\91934\\Downloads\\resume.pdf");
	}

}
