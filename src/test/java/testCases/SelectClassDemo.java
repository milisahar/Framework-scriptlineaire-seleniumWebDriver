package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/ressource/drivers/chromedriver.exe");
		//Open chrome
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Open URL OrangeHRM
		driver.get("https://demoqa.com/select-menu");
		
		// Maximize browse
		driver.manage().window().maximize();
		
		//Creat object of the Select class
		Select se = new Select(driver.findElement(By.id("oldSelectMenu")));
		
		//Select the option by index
		se.selectByIndex(3);
		
		//Select the option by value
		
		
		//Select the option by visibleText
		
		
		driver.quit();

	}

}