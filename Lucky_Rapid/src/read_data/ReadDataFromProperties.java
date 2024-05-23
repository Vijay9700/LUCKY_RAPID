package read_data;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadDataFromProperties {
	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		//step 1-->get the obj of external file
		FileInputStream fis=new FileInputStream("./commondata/data.properties");
		//step 2-->create an obj for properties class
		Properties prop=new Properties();
		//step 3-->load the file
		prop.load(fis);
		//step 4-->get the data
		String url = prop.getProperty("Url");
		String browser = prop.getProperty("Browser");
		System.out.println(url);
		System.out.println(browser);
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		
		
		driver.get(url);
	}

}
