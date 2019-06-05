package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtendsReportBasicDemo {

	private static WebDriver driver = null;

	public static void main(String[] args) {
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReports.html");

		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

		// creates a toggle for the given test, adds all log events under it
		ExtentTest test = extent.createTest("GoogleSearch Test 1",
				"This is a test to validate google search functionality");

		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver", projectPath + "\\drivers\\geckoDriver\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		test.log(Status.INFO, "Starting TestCase");
		driver.get("https://www.google.com/");
		test.pass("Navigated to google.com");
		
		WebElement textbox = driver.findElement(By.xpath("//input[@name='q']"));
		test.pass("Entered text in searchbox");
		
		textbox.sendKeys("Valentino Rossi");
		textbox.submit();
		test.pass("Enter keyboard enter key");
		
		driver.close();
		test.pass("Closed the browser");
		test.info("Test Completed");
		
		extent.flush();

	}
}
