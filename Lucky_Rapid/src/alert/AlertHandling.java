package alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {
	
	public static void main(String[] args) throws InterruptedException {
		//launch browser
		WebDriver driver=new ChromeDriver();
		//maximize
		driver.manage().window().maximize();
		//navigate to page
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		//click on click for js alert 
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		//click on ok button
		 //transfer control to alert and use accept()
		Thread.sleep(2000);
		String alertMessage = driver.switchTo().alert().getText();
		System.out.println(alertMessage);
		driver.switchTo().alert().dismiss();
	
	}

}
