package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/ressource/drivers/chromedriver.exe");
		// Open Chrome
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Open URL Tools Qa
		driver.get("https://demoqa.com/droppable");

		Actions action = new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));

		action.dragAndDrop(source, target).build().perform();

		// Verify Text Changed Into Dropped!
		String textTarget = target.getText();
		if (textTarget.equals("Dropped!")) {
			System.out.println("Pass: Source is dropped to target as expected");
		} else {
			System.out.println("Fail: Source could not be dropped to target as expected");

		}
		driver.quit();

	}

}
