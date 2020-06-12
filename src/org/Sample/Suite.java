package org.Sample;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Suite {
	
	@Parameters ({"Mobile"})
	@BeforeTest
	 public void mobile(String a){
		if (a.equalsIgnoreCase("Samsung"))
		{
			System.out.println("Welcome to SAMSUNG WORLD");
		}
		else if (a.equals("Iphone"))
		{
			System.out.println(" Welcome to IPHONE WORLD");
		}
		else 
		{
			System.out.println(" Welcome to ONEPLUS WORLD");
		}
	}
		@Parameters ({"Model","Price"})
		@Test
		public void mobile2(String b, String c)
		{
			System.out.println("The model is:" +b);
			System.out.println("The Price is:" +c);
		}
		
		@AfterTest
		public void mobile3()
		{
			System.out.println("Done");
		}
		}
		
	
		
