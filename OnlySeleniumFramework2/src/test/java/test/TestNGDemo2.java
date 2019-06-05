package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestNGDemo2 {

	WebDriver driver = null;

	@BeforeTest
	public void setupTest() {
		/*
		 * WebDriverManager.firefoxdriver().setup(); WebDriver driver = new
		 * FirefoxDriver();
		 */
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver", projectPath + "\\drivers\\geckoDriver\\geckodriver.exe");
		driver = new FirefoxDriver();

		// driver = new ChromeDriver();

	}

	@org.testng.annotations.Test
	public void googleSearch2() {
		// Setting up driver using WebDriverManager
		driver.get("https://www.google.com/");
		WebElement textbox = driver.findElement(By.xpath("//input[@name='q']"));
		textbox.sendKeys("Valentino Rossi");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		textbox.sendKeys(Keys.RETURN);

	}
	
	public void googleSearch3() {
		// Setting up driver using WebDriverManager
		driver.get("https://www.google.com/");
		WebElement textbox = driver.findElement(By.xpath("//input[@name='q']"));
		textbox.sendKeys("Valentino Rossi");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		textbox.sendKeys(Keys.RETURN);

	}

	@AfterTest
	public void tearDown() {
		driver.close();
		System.out.println("Test completed succesfully ");
	}

}
