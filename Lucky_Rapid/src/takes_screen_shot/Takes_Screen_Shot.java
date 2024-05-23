package takes_screen_shot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
 
public class Takes_Screen_Shot {
	
	public static void main(String[] args) throws IOException {
		Date date=new Date();
		System.out.println(date);
		String cdate = date.toString().replace(" ", "_").replace(":", "_");
		System.out.println(cdate);
		
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		//step 1-->type cast
		TakesScreenshot ts=(TakesScreenshot) driver;
		//step 2-->take ss and store temp
		File temp = ts.getScreenshotAs(OutputType.FILE);
		//step 3-->create perm loc to store ss
		File perm=new File("./screenshot/puppy"+ cdate+".png");
		//step 4-->copy from temp and store it in perm
		FileHandler.copy(temp, perm);
		driver.quit();  
	}

}
