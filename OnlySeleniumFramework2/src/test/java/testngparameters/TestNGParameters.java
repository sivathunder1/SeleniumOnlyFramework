package testngparameters;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameters {

	@Test
	@Parameters({ "myName" })
	public void test(@Optional("Duke") String name) {
		System.out.println("My name is " + name);

	}

}
