package com.sales.techmax.genericUtility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class IRetry implements IRetryAnalyzer{
  int counter=0;
  int retrylimit=2;
	public boolean retry(ITestResult result) {
		if(counter<retrylimit) {
			counter++;
			return true;
		}
			
		return false;
	}
	

}
