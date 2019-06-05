package seleniumimplicitandexplicitwai;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaitsDemo {

	public static void main(String[] args) {
		seleniumWaits();

	}

	static String projectPath = System.getProperty("user.dir");
	static WebDriver driver = null;

	public static void seleniumWaits() {
		System.setProperty("webdriver.gecko.driver", projectPath + "\\drivers\\geckoDriver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// default implicit wait is 250 ms
		driver.get("https://www.google.com/");
		WebElement textbox = driver.findElement(By.name("q"));
		textbox.sendKeys("Valentino Rossi");
		textbox.submit();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.name("abcd")));
		driver.close();
		driver.quit();

	}
	
	

}
