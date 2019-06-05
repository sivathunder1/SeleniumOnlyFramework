package testngdependencies;

import org.testng.annotations.Test;

public class TestNGDependencyDemo {

	@Test(dependsOnMethods = { "test2","test3" })
	public void test1() {
		System.out.println("Inside test1");
	}

	@Test(groups = "sanity1")
	public void test2() {
		System.out.println("Inside test2");
	}
	
	@Test(dependsOnGroups = {"sanity1"})
	public void test3() {
		System.out.println("Inside test3");
	}
}
