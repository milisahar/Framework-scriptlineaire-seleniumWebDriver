package homeWork;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyC {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src/test/ressource/drivers/chromedriver.exe");

		// Open Browser
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		driver.manage().window().maximize();

		// Get element color
		String color = driver.findElement(By.xpath("//*[@id=\"SIvCob\"]/a[1]")).getCssValue("color");
		String[] hexValue = color.replace("rgba(", "").replace(")", "").split(", ");

		int hexValue1 = Integer.parseInt(hexValue[0]);
		hexValue[1] = hexValue[1].trim();

		int hexValue2 = Integer.parseInt(hexValue[1]);
		hexValue[2] = hexValue[2].trim();

		int hexValue3 = Integer.parseInt(hexValue[2]);

		String actualColor = String.format("#%02x%02x%02x", hexValue1, hexValue2, hexValue3);
		Assert.assertEquals("#1a0dab", actualColor);
		System.out.println("The color of the text is: " + actualColor);

		driver.quit(); 
	}

}
