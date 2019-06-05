package test;

import org.testng.annotations.AfterMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestNGDemo {

	WebDriver driver = null;
	public static String browsername = null;

	@BeforeTest
	public void setupTest() {
		if (browsername.equalsIgnoreCase("chrome")) {
			String projectPath = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", projectPath + "\\drivers\\chrome74\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		}

		else if (browsername.equalsIgnoreCase("firefox")) {
			String projectPath = System.getProperty("user.dir");
			System.setProperty("webdriver.gecko.driver", projectPath + "\\drivers\\geckoDriver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

	}

	@org.testng.annotations.Test
	public void googleSearch() {
		// Setting up driver using WebDriverManager
		driver.get("https://www.google.com/");
		WebElement textbox = driver.findElement(By.xpath("//input[@name='q']"));
		textbox.sendKeys("Valentino Rossi");
		textbox.submit();

	}

	@AfterTest
	public void tearDown() {
		driver.close();
		System.out.println("Test completed succesfully ");
	}

}
