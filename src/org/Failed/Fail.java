package org.Failed;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Fail implements IRetryAnalyzer { // (Implemented the IRetryAnalyzer interface)
	
	int min=0; // how many we need to run the test case 
	int max =3;
	
	
	@Override // Override the retry method which is available in IRetryAnalyzer	
	//retry method will return boolean
	//ITestResult is a interface and result is a variable 
    public boolean retry(ITestResult result) {
        
		if(min<=max){
			min++;
		return true;
	}
	return false;

}

}			   