package org.Failed;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcase1 {

	@Test
	 public void test1(){
	 System.out.println("Test1 Method Was Started");
	 System.out.println("Test1 Method  Executed");
	}
	 
		@Test // implemented IRetryAnalyzer (Packagename.Classname.class)
		 public void test2(){
		 Assert.assertTrue(false);
		 System.out.println("Test2 Method Was not Executed");
		}
		
		@Test
		 public void hardAssert(){
		 System.out.println("hardAssert Method Was Started");
		 Assert.assertTrue(true);
		 System.out.println("hardAssert Method Was not Executed");
				 
		
	}

}

