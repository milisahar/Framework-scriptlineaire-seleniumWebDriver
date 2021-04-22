package testCases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/test/ressource/drivers/chromedriver.exe");

		// Open browser
		WebDriver driver = new ChromeDriver();

		// Open URl
		driver.get("http://demo.guru99.com/test/upload/");

		// Maximize browser
		driver.manage().window().maximize();

		WebElement uploadFile = driver.findElement(By.id("uploadfile_0"));
		uploadFile.sendKeys("C:\\Users\\asus\\Desktop\\formation selenium\\jour 6\\test upload file.png");

		driver.findElement(By.id("terms")).click();

		driver.findElement(By.id("submitbutton")).click();
		
		Thread.sleep(3000);

		String resultUpload = driver.findElement(By.xpath("//*[@id=\"res\"]/center")).getText();
		Assert.assertTrue(resultUpload.contains("successfully"));
		System.out.println("file has been successfully uploaded");

		driver.quit();
	}

}
