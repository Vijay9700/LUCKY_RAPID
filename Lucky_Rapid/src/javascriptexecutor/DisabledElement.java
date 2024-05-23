package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledElement {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		//identify the disabled element and pass data
		WebElement disabledElement = driver.findElement(By.xpath("//input[@class='form-control']"));
		//disabledElement.sendKeys("MS DHONI");-->ElementNotInteractableException
		//step 1-->typecast
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//step 2-->use jse methods
		js.executeScript("arguments[0].value='MS DHONI'",disabledElement);
	}

}
