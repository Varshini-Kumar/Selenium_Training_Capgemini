package webelementInterrogationMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextandTag {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

	    driver.get("https://www.selenium.dev/");
	    Thread.sleep(4000);
	    //locating About link
	    WebElement aboutlink = driver.findElement(By.id("navbarDropdown"));
	    aboutlink.click();
	    //get the visible text
	    System.out.println("name of the link is : " + aboutlink.getText());
	    //get the tagname
	    System.out.println("the tagname is : " + aboutlink.getTagName());
	    //printing whehter it is a link
	    if(aboutlink.getTagName().equals("a")) {
	    	System.out.println("It is a link");
	    }
	    else {
	    	System.out.println("It is not a link");
	    }
	    
	}

}
