package dws_scripts;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DWS_Register {
	
	WebDriver driver;
	Random random=new Random();
    int number = random.nextInt();
	String mail="vijayganesan"+number+"@gmail.com";
	
	@Test()
	@Parameters("browser")
	public void register(String browser)
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
	    
	    //navigate
	    driver.get("https://demowebshop.tricentis.com/");
	    //click on login
	    driver.findElement(By.xpath("//a[text()='Register']")).click();
	    //gender
	    driver.findElement(By.id("gender-male")).click();
	    //firstname
	    driver.findElement(By.id("FirstName")).sendKeys("VIJAY");
	    //lastname
	    driver.findElement(By.id("LastName")).sendKeys("GANESAN");
	    //email
	    driver.findElement(By.id("Email")).sendKeys(mail);
	    driver.findElement(By.id("Password")).sendKeys("vj@123");
	    //password
	    driver.findElement(By.id("ConfirmPassword")).sendKeys("vj@123");
	    //button
	    driver.findElement(By.id("register-button")).click();
	    
	    WebElement submit = driver.findElement(By.xpath("//input[@type=\"button\" and@class=\"button-1 register-continue-button\"]"));
	    
	    if(submit.isDisplayed())
	    {
	    	Reporter.log("Registeration done successfully...",true);
	    }
	    else
	    	Reporter.log("Registeration not done successfully...",true);
	}
}
