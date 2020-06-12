package org.Sample;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class Asserts {
	
	@Test
	 public void softAssert(){
	 SoftAssert softAssertion= new SoftAssert();
	 System.out.println("softAssert Method Was Started");
	 softAssertion.assertTrue(false);
	 System.out.println("softAssert Method Was Executed");
	// softAssertion.assertAll();
	 }
	 
	 @Test
	 public void hardAssert(){
	 System.out.println("hardAssert Method Was Started");
	 System.out.println("hardAssert Method Was Executed");
	 Assert.assertTrue(false);
	 System.out.println("After assertion fail it will not execute hard assert ");
	 System.out.println("Hard Assert completed");
	 
	 }
	 
	 @Test
	 public void softassert2()
	 {
		 SoftAssert softAssertion= new SoftAssert();
		 System.out.println("softAssert2 Method Was Started");
		 softAssertion.assertTrue(false);
		 System.out.println("softAssert2 Method Was Executed");
		 softAssertion.assertTrue(true);
		 System.out.println("Testng Assertion");
		  
	 }

	
	@Test
	public void dTest()
	{
		System.out.println("Executed dtest");

	}


}
