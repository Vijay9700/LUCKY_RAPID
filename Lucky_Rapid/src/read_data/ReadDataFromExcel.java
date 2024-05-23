package read_data;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//step 1-->get the object of excel file
		FileInputStream fis=new FileInputStream("./testscriptdata/shopperstack.xlsx");
		//step 2-->open the excel in read mode
		Workbook workbook = WorkbookFactory.create(fis);
		//step 3-->get sheet control
		Sheet sheet = workbook.getSheet("login");
		//step 4-->get the row control
		Row row = sheet.getRow(1);
		//step 5-->get the cell control
		Cell cell = row.getCell(0);
		//step 6-->fetch the data
		String email = cell.getStringCellValue();
		System.out.println(email);
		
		Row row1 = sheet.getRow(1);
		Cell cell1 = row.getCell(1);
		String pwd = cell1.getStringCellValue();
		System.out.println(pwd);
		
		//fetch data from properties
		FileInputStream fis1=new FileInputStream("./commondata/data.properties");
		Properties prop=new Properties();
		prop.load(fis1);
		String url = prop.getProperty("Url");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.manage().window().maximize();
		driver.get(url);
		//click on login in welcome page
		driver.findElement(By.name("loginBtn")).click();
		//login procedure
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.findElement(By.id("Login")).click();
		
	}

}
