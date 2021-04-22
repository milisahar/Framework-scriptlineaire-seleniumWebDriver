package testCases;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/ressource/drivers/chromedriver.exe");
		// Open Chrome
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Open URL Tools Qa
		driver.get("https://demoqa.com/buttons");
		
		// Instantiate action class
        Actions action = new Actions (driver);
        WebElement btnRightClick = driver.findElement(By.id("rightClickBtn"));
        action.contextClick(btnRightClick).perform();
        
        String rightClickMessage = driver.findElement(By.id("rightClickMessage")).getText();
		Assert.assertTrue(rightClickMessage.contains("right click"));
		
		// Kill browser
				driver.quit();
		
		
	}

}
