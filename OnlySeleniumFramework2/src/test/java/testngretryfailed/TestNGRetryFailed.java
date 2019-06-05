package testngretryfailed;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGRetryFailed {

	@Test
	public void test1() {
		System.out.println("I am inside test 1 ");
	}

	@Test
	public void test2() {
		System.out.println("I am inside test 2 ");
		int c = 10 / 0;
		System.out.println(c);
	}

	@Test
	public void test3() {
		System.out.println("I am inside test 2 ");
		Assert.assertTrue(false);
	}

}
