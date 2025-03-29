package TestClasspackage;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass implements ITestListener {

	@Override
	public void onTestStart(ITestResult Result) {
		System.out.println("Name of the Test method start"+Result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult Result) {
		System.out.println("Name of the Test success method:"+Result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult Result) {
		System.out.println("Name of test fail:"+ Result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult Result) {
		System.out.println("Name of the Test Skipped:"+Result.getName());
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Null");
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("Null 2");
	}

	@Override
	public void onStart(ITestContext Result) {
		System.out.println("On Start method invoked...."+Result.getName());
	}

	@Override
	public void onFinish(ITestContext Result) {
		System.out.println("On finish method invoked...."+Result.getName());
	}
	
	
}
