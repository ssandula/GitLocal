package Section16.testAutomationPractise1;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class excelData {

	public static void main(String []args) {
		// TODO Auto-generated method stub
		WebDriverWait wait;
		HSSFWorkbook workbook;
		HSSFSheet sheet;
		HSSFCell cell;
		
		
		  System.setProperty("webdriver.chrome.driver",
		  "C:\\Sai Automation\\chromedriver_win32\\chromedriver.exe");
		  
		  WebDriver driver = new ChromeDriver();
		  
		  driver.get("https://www.udemy.com/course/powerpoint365/");
		  driver.manage().window().maximize();
		  
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  
		  driver.findElement(By.xpath(
		  "//div[@class='buy-button']/div/div/div/button/span[1]")).click();
		  
		  driver.findElement(By.xpath("//input[@id='id_fullname']")).sendKeys("Helo");
		  
		  driver.findElement(By.xpath("//input[@id='email--1']")).sendKeys("shiva");
		  
		  driver.findElement(By.xpath("//input[@id='password']")).sendKeys("passwprd");
		  
		  driver.findElement(By.xpath("//input[@id='submit-id-submit']")).click();
		 
		

		
		/*
		 * try { // Specify the path of file File src=new
		 * File("C:\\Sai Automation\\TestData.xlsx");
		 * 
		 * // load file FileInputStream fis=new FileInputStream(src);
		 * 
		 * // Load workbook XSSFWorkbook wb=new XSSFWorkbook(fis);
		 * 
		 * // Load sheet- Here we are loading first sheetonly XSSFSheet sh1=
		 * wb.getSheetAt(0);
		 * 
		 * System.out.println(sh1.getRow(0).getCell(0).getStringCellValue());
		 * 
		 * System.out.println(sh1.getRow(0).getCell(1).getStringCellValue());
		 * 
		 * System.out.println(sh1.getRow(1).getCell(0).getStringCellValue());
		 * 
		 * System.out.println(sh1.getRow(1).getCell(1).getStringCellValue());
		 * 
		 * System.out.println(sh1.getRow(2).getCell(0).getStringCellValue());
		 * 
		 * System.out.println(sh1.getRow(2).getCell(1).getStringCellValue()); } catch
		 * (Exception e) {
		 * 
		 * System.out.println(e.getMessage());
		 * 
		 * }
		 */

		

	}

}
