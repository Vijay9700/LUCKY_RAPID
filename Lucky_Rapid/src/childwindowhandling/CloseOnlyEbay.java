package childwindowhandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseOnlyEbay {

	public static void main(String[] args) throws InterruptedException {
		//launch chrome
				WebDriver driver=new ChromeDriver();
				//maximize
				driver.manage().window().maximize();
				//navigate to shopper stack
				driver.get("https://shoppersstack.com/products_page/4");
				//click on i symbol
				Thread.sleep(50000);
				driver.findElement(By.xpath("//*[name()='svg' and @class='MuiSvgIcon-root MuiSvgIcon-colorPrimary MuiSvgIcon-fontSizeMedium css-2c7buj' ]")).click();
				//fetch the parent wid
				String pwid = driver.getWindowHandle();
				//fetch all wids
				Set<String> allWids = driver.getWindowHandles();
				for (String cwid: allWids) {
					//tranfer the control to the parent and child
					driver.switchTo().window(cwid);
					//fetch all the titles
					String allTitle = driver.getTitle();
					System.out.println(allTitle);
					
					//control only eBay
					if(allTitle.contains("eBay"))
					{ 
						driver.manage().window().maximize();
					}
				}
			}

	}


