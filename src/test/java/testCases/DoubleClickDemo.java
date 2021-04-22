package testCases;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/ressource/drivers/chromedriver.exe");
		// Open Chrome
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Open URL Tools Qa
		driver.get("https://demoqa.com/buttons");
		
		// Instantiate action class
        Actions action = new Actions (driver);
        WebElement btnDoubleClick = driver.findElement(By.id("doubleClickBtn"));
        action.doubleClick(btnDoubleClick).perform();
        
        String doubleClickMessage = driver.findElement(By.id("doubleClickMessage")).getText();
		Assert.assertTrue(doubleClickMessage.contains("double click"));
		
		System.out.println("Button is double clicked");
		
		driver.quit(); 

	}

}
