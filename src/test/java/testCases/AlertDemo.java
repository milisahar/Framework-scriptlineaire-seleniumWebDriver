package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/ressource/drivers/chromedriver.exe");
		// Open Chrome
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Open URL Tools Qa
		driver.get("https://demoqa.com/alerts");

		driver.findElement(By.id("alertButton")).click();

		//Accept Alert
		driver.switchTo().alert().accept();
		String title = driver.getTitle();
		System.out.println("Title of the page is: "+title);
		
		//Scroll buttom
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,400)","");
		
		
		driver.quit();
	}}
