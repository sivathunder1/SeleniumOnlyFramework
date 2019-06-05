package com.testng.prioritydemo;

import org.testng.annotations.Test;

public class TestNGpriorityDemo {

	@Test//(priority = 1)
	public void three() {
		System.out.println("Iam inside Test 1 ");
	}

	@Test//(priority = 1)
	public void two() {
		System.out.println("Iam inside Test 1 ");
	}

	@Test//(priority = 1)
	public void one() {
		System.out.println("Iam inside Test 1 ");
	}

}
