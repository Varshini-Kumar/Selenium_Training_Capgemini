package webelementInterrogationMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/");
        Thread.sleep(2000);
        WebElement radio = driver.findElement(By.id("pollanswers-1"));
        //verify the button is selected
        System.out.println("Is the good button selected "+ radio.isSelected());
        radio.click();
        Thread.sleep(2000);
        System.out.println("Is the good button selected after clicking" + radio.isSelected());
	}

}
