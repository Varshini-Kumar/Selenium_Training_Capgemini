package com.demo.seleniumgrid.launchingbrowser;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LaunchingFireFox {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
    FirefoxOptions options = new FirefoxOptions();
    WebDriver driver = new RemoteWebDriver(new URL(" http://192.168.31.185:4444"),options);
	driver.get("https://www.selenium.dev/");
	Thread.sleep(2000);
	driver.quit();
	}

}
