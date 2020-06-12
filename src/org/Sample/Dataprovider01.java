package org.Sample;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider01 {
	
	@Test(dataProvider="input") // provide the dataprovider name 
	public void setData(String username, String password)
	{
	System.out.println("your username is::"+username);
	System.out.println("your password is::"+password);
	}
	
	@DataProvider (name="input")
	public Object[][] datas(){
		//Return type of Dataprovider is a 2d array object
	return new Object[][]{{"sab","123"},{"Swathi","happ123"},{"mithra","love@123"}};
		
	}
	
	

}
