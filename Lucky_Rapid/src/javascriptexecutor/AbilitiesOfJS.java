package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbilitiesOfJS {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		
//		WebElement fn = driver.findElement(By.name("firstname"));
//		fn.sendKeys("VIJAY");
//		Thread.sleep(1000);
//		//fn.clear();
		WebElement male = driver.findElement(By.xpath("//input[@value='2']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",male);
		Thread.sleep(1000);
		//driver.navigate().refresh();
		js.executeScript("history.go();");
	}
	}

