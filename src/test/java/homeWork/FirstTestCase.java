package homeWork;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstTestCase {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src/test/ressource/drivers/chromedriver.exe");

		// Open browser
		WebDriver driver = new ChromeDriver();

		// Open URl
		driver.get("https://opensource-demo.orangehrmlive.com/");

		// Maximize browser
		driver.manage().window().maximize();

		// Fill user name
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");

		// Fill password
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");

		// Click on the login button
		driver.findElement(By.id("btnLogin")).click();

		// Verify authentication
		String adminUser = driver.findElement(By.id("welcome")).getText();
		Assert.assertEquals("Welcome Paul", adminUser);
		System.out.println("Succefully authentication");
		// Kill browser
		driver.quit();

	}

}
