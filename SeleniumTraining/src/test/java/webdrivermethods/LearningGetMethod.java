package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LearningGetMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
//navigating to youtube
		driver.get("https://www.amazon.in/");
//wait statement
		/*
		 * without thread.sleep title won't be printed since amazon is a huge appli and
		 * compiler does in few secs so it wont find <title>
		 */
		Thread.sleep(2000);
//fetching the title of the webpage
		String title = driver.getTitle();
		System.out.println(title);
	}

}
