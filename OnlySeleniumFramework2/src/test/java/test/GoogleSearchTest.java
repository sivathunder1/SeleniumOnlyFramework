package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.GoogleSearchPage;

public class GoogleSearchTest {

	private static WebDriver driver = null;

	public static void main(String[] args) {
		GoogleSearchTest.googleSearch();
	}

	public static void googleSearch() {
		// Setting up driver using WebDriverManager
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		
		GoogleSearchPage.textbox_search(driver).sendKeys("Valentino Rossi");
		GoogleSearchPage.button_search(driver).submit();

		driver.close();

		System.out.println("Test completed succesfully ");
	}

}
