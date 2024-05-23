package dws_scripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DWS_Logout {
	WebDriver driver;
	@Test()
	@Parameters("browser")
	public void logout(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("ie"))
		{
			driver=new InternetExplorerDriver();
		}
//		else {
//			driver=new ChromeDriver();
//		}
		 	//WebDriver driver=new ChromeDriver();
		    driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
		    driver.manage().window().maximize();
		    driver.get("https://demowebshop.tricentis.com/");
		    driver.findElement(By.xpath("//a[text()='Log in']")).click();
		    DWS_Register reg=new DWS_Register();
		    driver.findElement(By.id("Email")).sendKeys(reg.mail);
		    driver.findElement(By.id("Password")).sendKeys("vj@123");
		    driver.findElement(By.xpath("(//input[@type=\"submit\"])[2]")).click();
		    driver.findElement(By.xpath("//a[text()='Log out']")).click();
}
}
