package com.testng.multibrowser;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBrowserDemo {

	WebDriver driver = null;
	String projectPath = System.getProperty("user.dir");
	

	@Parameters("browserName")
	@BeforeClass
	public void setup(String browserName) {
		System.out.println("Browser Name is " + browserName);
		System.out.println("Thread ID is " + Thread.currentThread().getName());

		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", projectPath + "\\drivers\\chrome74\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", projectPath + "\\drivers\\geckoDriver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		else if (browserName.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", projectPath + "\\drivers\\iedriver\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}

	}

	@Test
	public void test1() {
		driver.get("https://www.google.com/");
	}

	@AfterTest
	public void tearDown() {
		driver.close();
		System.out.println("Test completed succesfully");

	}

}
