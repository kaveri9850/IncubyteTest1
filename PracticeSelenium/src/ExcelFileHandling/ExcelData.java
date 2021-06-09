package ExcelFileHandling;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class ExcelData {
	WebDriver driver;
	private File file;
	private FileInputStream fis;
	private XSSFWorkbook wb;
	private XSSFSheet sh;
	private XSSFRow rw;
	private XSSFCell cl;
	int row,cell,rowcount,cellcount;
  @Test(dataProvider="getdata")
  public void Logindata(String un,String pwd) {
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	  driver.findElement(By.id("txtCustomerID")).sendKeys(un);
	  driver.findElement(By.id("txtPassword")).sendKeys(pwd);
	  driver.findElement(By.id("Butsub")).click();
  }
  @AfterMethod
	 public void afterMethod() {
	  driver.findElement(By.id("txtCustomerID")).clear();
	  driver.findElement(By.id("txtPassword")).clear();
	 }
  
  @DataProvider
  public Object[][] getdata()
  {
	  rowcount=sh.getPhysicalNumberOfRows();
		 cellcount=sh.getRow(0).getPhysicalNumberOfCells();
	  Object[][] data=new Object[rowcount-1][cellcount-1];
	 
	  for(row=0;row<rowcount-1;row++)
	  {
		  rw=sh.getRow(row+1);
		  for(cell=0;cell<cellcount-1;cell++)
		  {
			  cl=rw.getCell(cell);
			  data[row][cell]=cl.getStringCellValue();
		  }
	  }
	  
	  
	return data;
	  
  }
  @BeforeTest
  public void beforeTest() throws IOException {
	  
	 
	  file=new File("E:\\ExcelFile\\first.xlsx");
	  fis=new FileInputStream(file);
	  wb=new XSSFWorkbook(fis);
	  sh=wb.getSheetAt(0);
	  System.setProperty("webdriver.chrome.driver", "D:\\Chrome91\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.echotrak.com");
	  
	
	 
  }
  

  @AfterTest
  public void afterTest() throws IOException {
	  driver.close();
	  wb.close();
	  fis.close();
  }
  

}
