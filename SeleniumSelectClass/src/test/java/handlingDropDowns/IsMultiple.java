package handlingDropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultiple {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(2000);
		WebElement listbox = driver.findElement(By.id("cars"));
		Select sel = new Select(listbox);
		//verifying whether the drop down is multi select
		System.out.println(sel.isMultiple());
		
		//locatin old style select menu
		Select sel1 = new Select(driver.findElement(By.id("oldSelectMenu")));
		System.out.println(sel1.isMultiple());
	}

}
