package testCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/ressource/drivers/chromedriver.exe");
		// Open chrome
		WebDriver driver = new ChromeDriver();
		// Open URL OrangeHRM
		String url = "https://opensource-demo.orangehrmlive.com/";
		driver.get(url);

		// Maximize browser
		driver.manage().window().maximize();
		WebElement element1 = driver.findElement(By.id("txtUsername"));
		String attValue = element1.getAttribute("id");
		System.out.println("The attribute is :" + attValue);
		element1.sendKeys("Selenium");
		// Delete Selenium
		element1.clear();

		WebElement element2 = driver.findElement(By.id("txtPassword"));
		Dimension dimensions = element2.getSize();
		System.out.println("High is :" + dimensions.height + "width is :" + dimensions.width);

		Point point = element2.getLocation();
		System.out.println("X cordinate " + point.x + "Y cordinate " + point.y);
		System.out.println("X cordinate " + point.getX() + "Y cordinate " + point.getY());

		WebElement element3 = driver.findElement(By.id("btnLogin"));

		// Verifier si le bouton est affiché true false
		boolean status = element3.isDisplayed();
		System.out.println(status);

		// Verifier si le bouton est activé true false
		boolean status2 = element3.isEnabled();
		System.out.println(status2);

		// Verifier si le bouton existe
		List<WebElement> element4 = driver.findElements(By.id("btnLogin"));
		if (element4.size() != 0) {
			System.out.println("Button exist");
		} else {
			System.out.println("Button doesn't exist");
		}
		driver.quit();

	}

}
