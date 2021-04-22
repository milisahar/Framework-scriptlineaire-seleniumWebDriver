package testCases;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeSwitchWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/test/ressource/drivers/chromedriver.exe");
		// Open chrome
		WebDriver driver = new ChromeDriver();

		// Maximize browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Open URL
		driver.get("https://demoqa.com/browser-windows");

		driver.manage().window().maximize();

		// Store and print the name of the first window
		String handele = driver.getWindowHandle();
		System.out.println("the first window is" + handele);

		driver.findElement(By.id("messageWindowButton")).click();

		// Store and print the name of the windows open
		Set<String> handeles = driver.getWindowHandles();
		System.out.println("the first window is" + handeles);

		// Pass a window handle to other window
		for (String handel1 : driver.getWindowHandles()) {
			System.out.println(handel1);

			// solution 1
			for (String handle1 : driver.getWindowHandles()) {

				driver.switchTo().window(handle1);
			}
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"menu-5760-particle\"]/nav/ul/li[1]/a/span/span")).click();

			// solution 2
			String your_title = "";
			String currentWindow = driver.getWindowHandle();
			for (String winHandle : driver.getWindowHandles()) {
				if (driver.switchTo().window(winHandle).getTitle().equals(your_title)) {
					break;
				} else {
					driver.switchTo().window(currentWindow);
				}
				// solution 3
				for (String handle1 : driver.getWindowHandles()) {

					driver.switchTo().window(handle1);
				}
				Thread.sleep(5000);
				driver.findElement(By.xpath("//*[@id=\"menu-5760-particle\"]/nav/ul/li[1]/a/span/span")).click();
			}
		}

	}

}
