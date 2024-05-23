package javascriptexecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfScrollTo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		// step 1-->type cast
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// use JSE methods
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,300);");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,300);");
	}

}
