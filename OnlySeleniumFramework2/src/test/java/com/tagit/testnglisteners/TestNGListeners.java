package com.tagit.testnglisteners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener {

	public void onFinish(ITestContext results) {
		System.out.println("******" + "TestFinished" + results.getName());
	}

	public void onTestStart(ITestResult results) {
		System.out.println("******" + "TestStarted" + results.getName());
	}

	public void onStart(ITestContext results) {
		System.out.println("******" + "OnStart" + results.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult results) {
		System.out.println("******" + "Test failed but with goof sucess percentage" + results.getName());
	}

	public void onTestFailure(ITestResult results) {
		System.out.println("******" + "Failed" + results.getName());
	}

	public void onTestSkipped(ITestResult results) {
		System.out.println("******" + "TestSkipped" + results.getName());
	}

	public void onTestSuccess(ITestResult results) {
		System.out.println("******" + "TestSuccess" + results.getName());
	}

}
