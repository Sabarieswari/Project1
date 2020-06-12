package org.Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseClass {
	static WebDriver driver;

	public static void chromesetUp(String url) {

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Hp/workspace/TestngwithBaseClass/chrome/chromedriver.exe");

		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}

	public static void iesetup(String url) {

		System.setProperty("webdriver.ie.driver", "C:/Users/Hp/workspace/TestngwithBaseClass/IE/IEDriverServer.exe");

		driver = new InternetExplorerDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}

	public static void closeBrowser1() {
		driver.quit();

	}

	public static void type1(WebElement loc, String in) {
		loc.sendKeys(in);
	}

	public static void click1(WebElement loc) {
		loc.click();
	}
}
