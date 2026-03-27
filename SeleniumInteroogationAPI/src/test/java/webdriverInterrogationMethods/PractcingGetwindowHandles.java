package webdriverInterrogationMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractcingGetwindowHandles {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demowebshop.tricentis.com/");
Thread.sleep(2000);
String parentId = driver.getWindowHandle();
System.out.println("parent id: " + parentId);



driver.findElement(By.xpath("//a[.='Facebook']")).click();
System.out.println(driver.getWindowHandles());
//Thread.sleep(1000);
Set<String>facebookid = driver.getWindowHandles();
facebookid.remove(parentId);
System.out.println("facebookid: "+ facebookid);
String fbid = "";
for(String str : facebookid) {
	fbid += str;
}


driver.findElement(By.xpath("//a[.='Twitter']")).click();
Set<String>twitterid = driver.getWindowHandles();
twitterid.remove(parentId);
twitterid.remove(fbid);
System.out.println("twitterid: "+ twitterid);


}

}
