package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardEvents {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/ressource/drivers/chromedriver.exe");

		// Open browser
		WebDriver driver = new ChromeDriver();

		// Open URl
		driver.get("https://demoqa.com/text-box");

		// Maximize browser
		driver.manage().window().maximize();

		WebElement fullName = driver.findElement(By.id("userName"));
		WebElement userEmail = driver.findElement(By.id("userEmail"));
		WebElement currentAddress = driver.findElement(By.id("currentAddress"));
		WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
		WebElement submitBtn = driver.findElement(By.id("submit"));

		// Class Actions

		Actions actions = new Actions(driver);
		actions.sendKeys(fullName, "Sahar Mili").perform();
		actions.sendKeys(userEmail, "mili@gmail.com").perform();
		actions.sendKeys(currentAddress, "Mourouj 3 Ben Arous 2074").perform();
		
		// Copy current address
		
		actions.keyDown(currentAddress, Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(permanentAddress, Keys.CONTROL).perform();
		actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		
		//submitBtn.submit();
		
		//Click button with javascript executor
		
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", submitBtn);
		
		

	}

}
