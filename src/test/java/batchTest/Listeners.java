package batchTest;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {
	public  void onTestStart(ITestResult result) {
		System.out.println("*****onTestStart "+result.getName());
		
	}
	public void onTestSuccess(ITestResult result) {
		System.out.println("*****onTestSuccess "+result.getName());
		
	}
	 public void onTestFailure(ITestResult result) {
		 System.out.println("*****onTestfailure "+result.getName());
	}
	
	public void onTestSkipped(ITestResult result) {
		System.out.println("*****onTestSkipped "+result.getName());
	}
	public void onFinish(ITestContext context) {
		System.out.println("*****onTestFinish "+context.getName());
	}
	

}
