package org.Testng;

import java.util.Date;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SampleTest2 extends BaseClass {
	
	
static  Locators l;
	
	
	@BeforeClass
	
	public void chromeBrowser()
	{
		iesetup("https://www.tnstc.in/TNSTCOnline/preUserLoginAction.do");
		//Assert.assertTrue(driver.getCurrentUrl().contains("TNSTCOnline"));
		//Assert.assertTrue(driver.getTitle().contains("TNSTC."));
	}

	@BeforeMethod
	public void startTime()
	{
		Date d = new Date();
		System.out.println(d);
	}
	 @AfterMethod
	 public void endTime()
	 {
		 Date a = new Date();
		 System.out.println(a);
	 }
	 
	 @Parameters({"Username", "Password"})
	 @Test
	 public void userDetail2(String us, String ps) throws InterruptedException
	 {
		 Thread.sleep(5000);
		 l = new Locators();
		 type1(l.getTxtUsername(),us);
		 Thread.sleep(1000);
		 type1(l.getTxtPassword(),ps);
		 Thread.sleep(1000);
		 click1(l.getTxtbtnSignIN());
		 
		 
	 }
	 
	 @AfterClass
	 
	 public void close()
	 {
		 closeBrowser1();
	 }
	 
}


