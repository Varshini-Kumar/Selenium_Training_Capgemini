package webdriverInterrogationMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
	Thread.sleep(2000);
	//fetching the window Id of parent window
	String parentId = driver.getWindowHandle();
	System.out.println(parentId);
	
	//click on a tab to get child window popup
	driver.findElement(By.xpath("//h2[.='Watches']/..//button")).click();
	Thread.sleep(2000);
	//fetching the window Ids of both parent and child window popup
	Set<String> allwindowIds = driver.getWindowHandles();
	System.out.println("window Ids of both parent and child window: "+allwindowIds);
	//removing parentid from allIds
	allwindowIds.remove(parentId);
	//child is still in set<String>
	System.out.println(allwindowIds);
	for(String str : allwindowIds) {
		System.out.println("window Id of child"+str);
	}
	Thread.sleep(2000);
	driver.quit();
	
	
	}

}
