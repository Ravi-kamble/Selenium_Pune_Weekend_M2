package basicsTestNg;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryEx implements IRetryAnalyzer{

	int count=0;
	int limit=3;
	
	@Override
	public boolean retry(ITestResult result) {
		
		if (count<limit) {
			count++;
			return true;
		}
		
		return false;
	}

	

}
