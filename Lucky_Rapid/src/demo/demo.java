package demo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://admin:admin@basic-auth-git-main-shashis-projects-4fa03ca5.vercel.app/");
		ex ex=new ex();
		System.out.println(ex.excelData("login", 1, 0));
		System.out.println(ex.excelData("login", 1, 1));
	}

}
