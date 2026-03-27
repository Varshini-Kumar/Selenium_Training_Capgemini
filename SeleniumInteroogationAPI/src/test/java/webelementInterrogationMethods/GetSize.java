package webelementInterrogationMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.amazon.in/");
Thread.sleep(2000);
//Locate the search button
WebElement searchbtn = driver.findElement(By.id("nav-search-submit-button"));
Dimension dims = searchbtn.getSize();
System.out.println("the dimension of the search button is:" + dims);
//fetch the height
System.out.println(dims.getHeight());
System.out.println(dims.height); //final variable in dimension class

//fetch the width
System.out.println(dims.getWidth());
System.out.println(dims.width);
System.out.println(searchbtn.getCssValue("height"));


	}

}
