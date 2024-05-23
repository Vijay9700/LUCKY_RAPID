package alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/upload");
		WebElement upload = driver.findElement(By.id("file-upload"));
		Thread.sleep(3000);
		upload.sendKeys("C:\\Users\\qspiders kphb\\Downloads");
		Thread.sleep(3000);
		driver.findElement(By.id("file-submit")).click();
	}

}
