package org.Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {
	
	@Parameters({"url","username","password"})
	@Test
	public void fb(String u1, String us, String ps)
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/Hp/workspace/HotelBooking/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(u1);
		driver.findElement(By.id("email")).sendKeys(us);
		driver.findElement(By.id("pass")).sendKeys(ps);
		
	}

}
