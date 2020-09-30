package Section16.testAutomationPractise1;

import java.io.File;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.ss.usermodel.Workbook;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelData1 {

    public void readExcel(String filePath,String fileName,String sheetName) throws IOException{
    	
    	
    	 System.setProperty("webdriver.chrome.driver",
    	  		  "C:\\Sai Automation\\chromedriver_win32\\chromedriver.exe");
    	  		  
    	  		  WebDriver driver = new ChromeDriver();
    	    
    	  		  driver.get("https://www.udemy.com/course/powerpoint365/");
    		  driver.manage().window().maximize();
    		  
    		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    		  
    		  driver.findElement(By.xpath(
    		  "//div[@class='buy-button']/div/div/div/button/span[1]")).click();

    //Create an object of File class to open xlsx file

    File file =    new File("C:\\Sai Automation\\TestData.xlsx");

    //Create an object of FileInputStream class to read excel file

    FileInputStream inputStream = new FileInputStream(file);

    Workbook TestData = null;

    //Find the file extension by splitting file name in substring  and getting only extension name

    String fileExtensionName = fileName.substring(fileName.indexOf("."));

    //Check condition if the file is xlsx file

    if(fileExtensionName.equals(".xlsx")){

    //If it is xlsx file then create object of XSSFWorkbook class

    	TestData = new XSSFWorkbook(inputStream);

    }

    //Check condition if the file is xls file

    else if(fileExtensionName.equals(".xls")){

        //If it is xls file then create object of HSSFWorkbook class

    	TestData = new HSSFWorkbook(inputStream);

    }

    //Read sheet inside the workbook by its name

    Sheet Udemy = TestData.getSheet(sheetName);

    //Find number of rows in excel file

    int rowCount = Udemy.getLastRowNum()-Udemy.getFirstRowNum();

    //Create a loop over all the rows of excel file to read it

    for (int i = 0; i < rowCount+1; i++) {

        Row row = Udemy.getRow(i);
        
        

        //Create a loop to print cell values in a row

        for (int j = 0; j < row.getLastCellNum(); j++) {

            //Print Excel data in console

            System.out.print(row.getCell(j).getStringCellValue()+"|| ");
            

        }

        System.out.println();
    } 
    
    
    
    
   
	  
	  
    driver.findElement(By.xpath("//input[@id='id_fullname']")).sendKeys();
	  driver.findElement(By.xpath("//input[@id='email--1']")).sendKeys("shiva");
	  
	  driver.findElement(By.xpath("//input[@id='password']")).sendKeys("passwprd");
	  
	  driver.findElement(By.xpath("//input[@id='submit-id-submit']")).click();
    
    
    
    
    
    
    
    }  
    
    

    //Main function is calling readExcel function to read data from excel file

   // public static void main(String...strings) throws IOException{

    //Create an object of ReadGuru99ExcelFile class

    ExcelData1 objExcelFile = new ExcelData1();

    //Prepare the path of excel file

    //String filePath = System.getProperty("C:\\\\Sai Automation\\\\TestData.xlsx");

    //Call read file method of the class to read data

    //objExcelFile.readExcel(filePath,"TestData.xlsx","Udemy");
    
	/*
	 * System.setProperty("webdriver.chrome.driver",
	 * "C:\\Sai Automation\\chromedriver_win32\\chromedriver.exe");
	 * 
	 * WebDriver driver = new ChromeDriver();
	 * 
	 * driver.get("https://www.udemy.com/course/powerpoint365/");
	 * driver.manage().window().maximize();
	 * 
	 * driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 * 
	 * driver.findElement(By.xpath(
	 * "//div[@class='buy-button']/div/div/div/button/span[1]")).click();
	 * 
	 * driver.findElement(By.xpath("//input[@id='id_fullname']")).sendKeys("Helo");
	 * 
	 * driver.findElement(By.xpath("//input[@id='email--1']")).sendKeys("shiva");
	 * 
	 * driver.findElement(By.xpath("//input[@id='password']")).sendKeys("passwprd");
	 * 
	 * driver.findElement(By.xpath("//input[@id='submit-id-submit']")).click();
	 */
    
    

    }

