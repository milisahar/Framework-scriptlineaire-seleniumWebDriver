package testCases;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "src/test/ressource/drivers/chromedriver.exe");
		// Open chrome
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		// Open URL OrangeHRM
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		Thread.sleep(3000);

		// Maximize browser
		driver.manage().window().maximize();

		// Fill Username
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");

		Thread.sleep(3000);

		// Fill password
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");

		Thread.sleep(3000);

		// Click on button Login
		// driver.findElement(By.id("btnLogin")).click();

		// Click login button with explicit wait
		WebElement btnLogin;
		btnLogin = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btnLogin")));
		btnLogin.click();
		Thread.sleep(3000);

		String adminUser = driver.findElement(By.id("welcome")).getText();
		Assert.assertEquals("Welcome Paul", adminUser);
		System.out.println("Successfully authentification");
		// Kill browser
		driver.quit();

	}

}
