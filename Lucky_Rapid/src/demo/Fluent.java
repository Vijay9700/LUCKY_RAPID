package demo;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Fluent {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//create an obj for fluent wait
		FluentWait wait = new FluentWait(driver);
		//specify the time for wait
		wait.withTimeout(Duration.ofSeconds(20));
		//polling time
		wait.pollingEvery(Duration.ofMillis(500));
		//ignoring the exception
		wait.ignoring(NoSuchElementException.class);
		//provide condition
		wait.until(ExpectedConditions.visibilityOf(null));
	}

}
