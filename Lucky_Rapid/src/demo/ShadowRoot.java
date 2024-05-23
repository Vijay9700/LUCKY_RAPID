package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowRoot {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//identify email and pass data
		WebElement email = driver.findElement(By.id("email"));
		SearchContext sr = email.getShadowRoot();
		System.out.println(sr);
		driver.quit();
	}

}
