package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilitiesDemo {
	static WebDriver driver = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DesiredCapabilities dc  = new DesiredCapabilities();
		dc.setCapability("ignoreProtectedModeSetting", true);
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.ie.driver", projectPath + "\\drivers\\iedriver\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver(dc);
		driver.get("https://www.google.com/");
		WebElement textbox = driver.findElement(By.xpath("//input[@name='q']"));
		textbox.sendKeys("Valentino Rossi");
		textbox.submit();

		driver.close();

	}

}
