package org.Sample;

import org.testng.annotations.Test;

public class Dependsmethods {
	
	@Test(dependsOnMethods = {"testCase2"})
	public void testCase1(){
		System.out.println("Test Case 1");
	}
	@Test(dependsOnMethods = {"testCase3"})
	public void testCase2(){
		System.out.println("Test Case 2");
	}
	@Test
	public void testCase3(){
		System.out.println("Test Case 3");
	}

}


