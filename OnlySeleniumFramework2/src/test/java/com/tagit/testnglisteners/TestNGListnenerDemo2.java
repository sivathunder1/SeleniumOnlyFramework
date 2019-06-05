package com.tagit.testnglisteners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.tagit.testnglisteners.TestNGListeners.class)
public class TestNGListnenerDemo2 {

	@Test
	public void test4() {
		System.out.println("I am inside test4");

	}

	@Test
	public void test5() {
		System.out.println("I am inside test5");
		Assert.assertTrue(false);

	}

	@Test
	public void test6() {
		System.out.println("I am inside test6");
		throw new SkipException("This test has been skipped");

	}

}
