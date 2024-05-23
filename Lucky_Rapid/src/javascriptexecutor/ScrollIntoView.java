package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoView {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		// step 1-->type cast
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// use JSE methods
		Thread.sleep(2000);
		WebElement subscribe = driver.findElement(By.xpath("//button[text()='Subscribe']"));
		js.executeScript("arguments[0].scrollIntoView(false);",subscribe );
	}

}
