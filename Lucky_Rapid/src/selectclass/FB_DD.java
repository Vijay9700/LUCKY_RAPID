package selectclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FB_DD {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		WebElement yearDD = driver.findElement(By.id("year"));
		Select sel=new Select(yearDD);
		//sel.selectByVisibleText("2002");
		//use of getOptions method
		List<WebElement> opt = sel.getOptions();
//		for(int i=0;i<opt.size();i++)
//		{
//			sel.selectByIndex(i);
//		}
		for (WebElement sopt: opt) {
			String text = sopt.getText();
			sel.selectByVisibleText(text);
			
		}
	}

}
