package handlingDropDowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearningDeslectMethods {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
Thread.sleep(2000);
Select sel = new Select(driver.findElement(By.id("select-multiple-native")));
sel.selectByVisibleText("Solid Gold Petite Mi...");
sel.selectByVisibleText("John Hardy Women's L...");
sel.selectByVisibleText("White Gold Plated Pr...");
sel.selectByVisibleText("Pierced Owl Rose Gol...");
Thread.sleep(2000);
//deselect by index
sel.deselectByIndex(6);
//deselect by value
sel.deselectByValue("John Hardy Women's Legends Naga Gold & Silver Dragon Station Chain Bracelet");
Thread.sleep(2000);
//deselect by visibletext
sel.deselectByVisibleText("Solid Gold Petite Mi...");
Thread.sleep(2000);
sel.deSelectByContainsVisibleText("Pierced Owl Rose Gol...");
Thread.sleep(2000);
sel.selectByVisibleText("Solid Gold Petite Mi...");
sel.selectByVisibleText("John Hardy Women's L...");
sel.selectByVisibleText("White Gold Plated Pr...");
sel.selectByVisibleText("Pierced Owl Rose Gol...");
Thread.sleep(2000);
//deselecting all the options
sel.deselectAll();
List<WebElement>allopt = sel.getOptions();
for(WebElement opt : allopt) {
	System.out.println(opt.getText());
}
	


	}

}
