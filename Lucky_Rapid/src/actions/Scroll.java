package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		WebElement subscribe = driver.findElement(By.xpath("//button[text()='Subscribe']"));
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		act.scrollToElement(subscribe).perform();
	}

}
