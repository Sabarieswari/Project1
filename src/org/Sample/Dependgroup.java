package org.Sample;

import org.testng.annotations.Test;

public class Dependgroup {
	
	@Test(groups = {"FirstGroup"})
	 public void testCase1(){
	 System.out.println("Test Case 1");
	 }
	 @Test(groups = {"SecondGroup"})
	 public void testCase2(){
	 System.out.println("Test Case 2");
	 }
	 
	 @Test(groups = {"SecondGroup"})
	 public void testCase3(){
	 System.out.println("Test Case 3");
	 }
	 @Test(groups = {"SecondGroup"})
	 public void testCase4(){
	 System.out.println("Test Case 4");
	 }
	 @Test(groups = {"FirstGroup"})
	 public void testCase5(){
	 System.out.println("Test Case 5");
	 }

}
