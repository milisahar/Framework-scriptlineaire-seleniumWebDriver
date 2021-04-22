package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class MouseHouver3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/ressource/drivers/chromedriver.exe");
		// Open chrome
		WebDriver driver = new ChromeDriver();

		// Maximize browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Open URL
		driver.get("https://demoqa.com/slider/");
		
		

		Actions action = new Actions(driver);
		
		WebElement Slider = driver.findElement(By.id("sliderContainer"));
		
		action.moveToElement(Slider,50,0).perform();
		Slider.click();
		 
		//driver.quit();

		
	}

}