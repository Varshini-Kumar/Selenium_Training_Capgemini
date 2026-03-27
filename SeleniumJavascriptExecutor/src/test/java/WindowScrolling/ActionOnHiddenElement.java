package WindowScrolling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionOnHiddenElement {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://www.facebook.com/reg/?entry_point=login&next=");

        // select your gender
        driver.findElement(By.xpath("//div[contains(@id,'_R_mad6p4jikacppb6amH')]")).click();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//div[@role='option' and contains(@id,'_R_mad6p4jikacppb6amH4_')]")).click();

        WebElement hiddenEle = driver.findElement(By.xpath("//input[contains(@id,'_r_')]"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].value='secret'", hiddenEle);

    }
}

