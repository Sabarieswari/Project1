package org.Failed;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class Fail2 implements IAnnotationTransformer {


	@Override
	public void transform(ITestAnnotation arg0, Class arg1, Constructor arg2, Method arg3) {
		
		
		arg0.setRetryAnalyzer(Fail.class); // setRetryAnalyzer is method 
											// fail.class where we have implemented IRetryAnalyzer
		
	}

}

