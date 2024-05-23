package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UseOfMoveToElement {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//identify the computers
		Thread.sleep(2000);
		WebElement computer = driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[1]"));
		//to perform mouse actions
		//step--1-->create an obj for actions and pass driver ref
		Actions act=new Actions(driver);
		//step 2-->use methods
		Thread.sleep(2000);
		act.moveToElement(computer).perform();
		//identify desktop and click
		WebElement desktop = driver.findElement(By.xpath("(//a[contains(text(),'Desktops')])[1]"));
		Thread.sleep(2000);
		//desktop.click();
		act.click(desktop).perform();
		//driver.quit();
  
	}

}
