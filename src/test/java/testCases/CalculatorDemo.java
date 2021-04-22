package testCases;

import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalculatorDemo {

	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver", "src/test/ressource/drivers/chromedriver.exe");

	// open chrome
	WebDriver driver = new ChromeDriver();

	// open url orangeHRM
	driver.get("https://juliemr.github.io/protractor-demo/");
	driver.manage().window().maximize();

	driver.findElement(By.xpath("//input[@ng-model='first']")).sendKeys("4");
	driver.findElement(By.xpath("//input[@ng-model='second']")).sendKeys("2");
	driver.findElement(By.id("gobutton")).click();

	WebElement result = driver.findElement(By.tagName("h2"));
	WebDriverWait wait = new WebDriverWait(driver, 20);

	Pattern pattern = Pattern.compile("\\d+");

	wait.until(ExpectedConditions.textMatches(By.tagName("h2"), pattern));
	System.out.println("The result is " +result.getText());

	driver.quit();

	}}