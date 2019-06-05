package test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtendsReportDemoWithTestNG {
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	WebDriver driver;

	@BeforeSuite
	public void setup() {
		htmlReporter = new ExtentHtmlReporter("extent1.html");
		// create ExtentReports and attach reporter(s)
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

	}

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
	public void test1() throws IOException {

		ExtentTest test = extent.createTest("MyFirstTest", "Sample description");

		driver.get("https://www.google.com/");
		WebElement textbox = driver.findElement(By.xpath("//input[@name='q']"));
		textbox.sendKeys("Valentino Rossi");
		textbox.submit();
		test.pass("Navigated to google.com");

		test.log(Status.INFO, "This step shows usage of log(status, details)");
		// info(details)
		test.info("This step shows usage of info(details)");
		// log with snapshot
		test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		// test with snapshot
		test.addScreenCaptureFromPath("screenshot.png");

	}

	@AfterTest
	public void tearDown() {
		driver.close();
		System.out.println("Test completed succesfully ");
	}

	@AfterSuite
	public void teardown() {
		driver.quit();
	}
}
