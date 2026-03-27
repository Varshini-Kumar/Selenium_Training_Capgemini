package WindowScrolling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ActionOnDisabledElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.oracle.com/java/technologies/javase-jdk25-doc-downloads.html");
		Thread.sleep(3000);
		// clicking on the link
		driver.findElement(By.linkText("jdk-25.0.2_doc-all.zip")).click();
		Thread.sleep(2000);
		// locate the disabled button
		WebElement disabledbtn = driver.findElement(By.linkText("Download jdk-25.0.2_doc-all.zip"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", disabledbtn);
	}

}
