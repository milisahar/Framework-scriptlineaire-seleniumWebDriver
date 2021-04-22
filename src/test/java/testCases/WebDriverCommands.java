package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/ressource/drivers/chromedriver.exe");
		// Open chrome
		WebDriver driver = new ChromeDriver();
		// Open URL OrangeHRM
		String url = "https://opensource-demo.orangehrmlive.com/";
		driver.get(url);

		// Maximize browser
		driver.manage().window().maximize();

		String titlePage = driver.getTitle();

		int titleLength = titlePage.length();
		System.out.println("The title of the page is :" + titlePage);
		System.out.println("Length title of the page is :" + titleLength);

		// To verify current Url

		String actualURL = driver.getCurrentUrl();
		if (actualURL.equals(url)) {
			System.out.println("Verification successfull - The correct URL is opened");
		} else {
			System.out.println("Verification failed - An incorrect URL is opened");
		}
		// Print actualURL and URL
		System.out.println("Actual URL is :" + actualURL);
		System.out.println("Expected URL is :" + url);
		String sourcePage = driver.getPageSource();
		int lengthSourcePage = sourcePage.length();
		System.out.println("Length of the source page is :" + lengthSourcePage);
		driver.quit();
	}

}
