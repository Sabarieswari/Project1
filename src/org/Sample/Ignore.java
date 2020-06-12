package org.Sample;

import org.testng.annotations.Test;

public class Ignore {

	@Test (priority = 5 )
	public void aTest()
	{
		System.out.println("Executed atest");

	}
	
	@Test (priority = 2)
	public void bTest()
	{
		System.out.println("Executed btest");

	}
	
	@Test (priority = -1 )
	public void cTest()
	{
		System.out.println("Executed ctest");

	}
	
	@Test
	public void dTest()
	{
		System.out.println("Executed dtest");

	}

}
