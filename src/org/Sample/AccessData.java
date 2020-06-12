package org.Sample;

import org.testng.annotations.Test;

public class AccessData {
	
	@Test(dataProvider="input", dataProviderClass=Dataprovider01.class) 
	//  provide the dataprovider name and class name 
	public void setData(String username, String password)
	{
	System.out.println("your name is::"+username);
	System.out.println("your password is::"+password);
	}
	

}