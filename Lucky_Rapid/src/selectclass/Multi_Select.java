package selectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi_Select {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		WebElement listBox = driver.findElement(By.id("cars"));
		Select sel=new Select(listBox);
		sel.selectByIndex(0);
		Thread.sleep(2000);
		sel.selectByIndex(1);
		Thread.sleep(2000);
		sel.selectByIndex(2);
		Thread.sleep(2000);
		//sel.deselectByIndex(1);
		sel.deselectAll();
	}

}
