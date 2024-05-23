package endtoend;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DWS {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		//IMPLICITLY WAIT
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//identify the jw
		driver.findElement(By.partialLinkText("Jewelry")).click();
		//choose an item
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
		//pass length
		WebElement length=driver.findElement(By.xpath("//input[@class=\"textbox\"]"));
		//choose heart
		driver.findElement(By.id("product_attribute_71_11_17_49")).click();
		//click on add to cart
		driver.findElement(By.id("add-to-cart-button-71")).click();
		Thread.sleep(5000);//-->the functionality of app like that-->should use blind wait
		//click on shopping cart
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		//validate
		String name = driver.findElement(By.xpath("(//a[text()='Create Your Own Jewelry'])[2]")).getText();
		//validate
		String expected="Create Your Own Jewelry";
		if(name.contains(expected))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		driver.quit();
	}

}
