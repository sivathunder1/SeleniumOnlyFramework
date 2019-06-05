package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.GoogleSearchPageObjects;

public class GoogleSearchPageTest {

	static WebDriver driver = null;

	public static void main(String[] args) {
		googleSearchTest();
	}

	public static void googleSearchTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		GoogleSearchPageObjects googleSearch = new GoogleSearchPageObjects(driver);
		driver.get("https://www.google.com/");
		googleSearch.settextInSearchBox("Valentino Rossi");
		driver.close();
	}

}
