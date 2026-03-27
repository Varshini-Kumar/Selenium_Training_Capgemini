package relativeloactor;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GetandSetSize {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new EdgeDriver();
System.out.println(driver.manage().window().getSize());
Thread.sleep(2000);
Dimension dim = new Dimension(1500, 500);
driver.manage().window().setSize(dim);
	}

}
