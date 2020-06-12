package org.Sample;

import org.testng.annotations.Test;

public class M2 {
	@Test
	 public void Method1(){
		long id = Thread.currentThread().getId();
		System.out.println("Method1 is executed with Thread Id:"+ id);
	
	 }
	 
	 @Test
	 public void Method2(){
		 long id = Thread.currentThread().getId();
			System.out.println("Method2 is executed with Thread Id:"+ id);
		
	 
	 }
	 
	 @Test
	 public void Method3(){
		 long id = Thread.currentThread().getId();
			System.out.println("Method3 is executed with Thread Id:"+ id);

		  
	 }

	
	@Test
	 public void Method4(){
		 long id = Thread.currentThread().getId();
			System.out.println("Method4 is executed with Thread Id:"+ id);
	}

	
	



}
