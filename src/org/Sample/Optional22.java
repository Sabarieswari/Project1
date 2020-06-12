package org.Sample;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Optional22 {
	
	@Test
    @Parameters({"name","age"})
    public void testMethod(@Optional ("sabari") String s1,  String s2) 
    
 // Here i have  defined  value with @optional 
    
    {
        System.out.println("Paramters one for name:"+s1);
        System.out.println("Paramters two for age: "+s2);
    }


}

