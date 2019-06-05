package com.tagit.testnglisteners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.tagit.testnglisteners.TestNGListeners.class)
public class TestNGListnenerDemo {
	
	WebDriver driver = null;

	@Test
	public void test1() {
		System.out.println("I am inside test1");

	}

	@Test
	public void test2() {
		System.out.println("I am inside test2");
		Assert.assertTrue(false);
		
		String projectPath = System.getProperty("user.dir");
		
		System.setProperty("webdriver.gecko.driver", projectPath + "\\drivers\\geckoDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		WebElement textbox = driver.findElement(By.xpath("//input[@name='q']"));
		textbox.sendKeys("Valentino Rossi");
		textbox.submit();

		

	}

	@Test
	public void test3() {
		System.out.println("I am inside test3");
		throw new SkipException("This test has been skipped");

	}

}
