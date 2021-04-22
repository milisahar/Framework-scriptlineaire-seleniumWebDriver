package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TooltipDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/ressource/drivers/chromedriver.exe");
		// Open chrome
		WebDriver driver = new ChromeDriver();

		// Maximize browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Open URL
		driver.get("http://demoqa.com/tool-tips/");

		driver.manage().window().maximize();

		WebElement text = driver.findElement(By.id("toolTipButton"));
		String textTooltip = text.getText();

		if (textTooltip.equalsIgnoreCase("Hover me to see")) {
			System.out.println("Pass: Tooltip matched expected value");
		} else {
			System.out.println("Fail: Tooltip not matching expected value");
		}
		WebElement placeHoder = driver.findElement(By.id("toolTipTextField"));
		String textPlaceholder = placeHoder.getAttribute("placeholder");
		System.out.println("Placeholder is :"+ textPlaceholder);
		
		driver.quit();

	}

}
