package org.Sample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FailedManual {
	
	
	@Test
	 public void hardAssert(){
	 System.out.println("hardAssert Method Was Started");
	 System.out.println("hardAssert Method Was Executed");
	 Assert.assertTrue(true);
	 System.out.println("After assertion fail it will not execute hard assert ");
	 System.out.println("Hard Assert completed");
	 

}
}

