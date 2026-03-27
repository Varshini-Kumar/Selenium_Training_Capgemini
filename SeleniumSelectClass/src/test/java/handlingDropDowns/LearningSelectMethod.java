package handlingDropDowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearningSelectMethod {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demo.automationtesting.in/Register.html");
Thread.sleep(2000);
//locating skills dropdown
WebElement dropdown = driver.findElement(By.id("Skills"));
//making object of select class
Select sel = new Select(dropdown);
//calling select method
//by index
sel.selectByIndex(9);
Thread.sleep(2000);
//by value attribute 
sel.selectByValue("Java");
//by visible text
Thread.sleep(2000);
sel.selectByVisibleText("Engineering");
Thread.sleep(2000);
//by contains visible text
sel.selectByContainsVisibleText("script");
//fetching the dropdown
List<WebElement>allopt = sel.getOptions();
for(WebElement opt : allopt) {
	System.out.println(opt.getText());
}
	}

}
