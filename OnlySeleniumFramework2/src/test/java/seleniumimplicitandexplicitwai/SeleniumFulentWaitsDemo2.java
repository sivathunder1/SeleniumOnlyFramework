package seleniumimplicitandexplicitwai;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumFulentWaitsDemo2 {

	public static void main(String[] args) {
		seleniumWaits();

	}

	static String projectPath = System.getProperty("user.dir");
	static WebDriver driver = null;

	public static void seleniumWaits() {
		System.setProperty("webdriver.gecko.driver", projectPath + "\\drivers\\geckoDriver\\geckodriver.exe");
		driver = new FirefoxDriver();

		// default implicit wait is 250 ms
		driver.get("https://www.google.com/");
		WebElement textbox = driver.findElement(By.name("q"));
		textbox.sendKeys("Valentino Rossi");
		textbox.submit();

		WebElement linktext = driver.findElement(By.xpath(
				" /html/body/div[6]/div[3]/div[10]/div[1]/div[2]/div/div[2]/div[2]/div/div/div/div[3]/div/div/div/div[1]/a/h3"));
		linktext.click();
		// FluentWait<T>
		driver.close();
		driver.quit();

	}

}
