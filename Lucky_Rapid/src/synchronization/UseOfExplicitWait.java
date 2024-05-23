package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UseOfExplicitWait {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		//create an obj for Webdriverwait and specify time
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		//use until() and specify condition
		wait.until(ExpectedConditions.alertIsPresent());
	}

}
