package testnggroup;

import org.testng.annotations.Test;

public class TestNGGroupDemo {

	@Test(groups = { "sanity" })
	public void test1() {

	}

	@Test(groups = { "sanity", "smoke" })
	public void test2() {

	}

	@Test(groups = { "sanity", "regression" })
	public void test3() {

	}

	@Test
	public void test4() {

	}

}
