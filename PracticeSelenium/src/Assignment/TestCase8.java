package Assignment;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class TestCase8 {
	private File file;
	 private FileInputStream fis;
	 private FileOutputStream fos;
	 private HSSFWorkbook wb;
	 private HSSFSheet sh;
	 private HSSFRow rw;
	 private HSSFCell cl;
	 private WebDriver driver;
	 private String exp="Oops, that's not a match.", act;
	 private int rowCount, colCount, row, col=0, i=1, j=5 ,k=4,l=1;

	 @Test(dataProvider = "getData")
	 public void EbayLogin(String un, String pwd) throws IOException, InterruptedException {
		 
	 
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 // driver.findElement(By.id("userid")).sendKeys(un);
	  driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(un);
	//  driver.findElement(By.id("kmsi-checkbox")).click();
	  //Thread.sleep(2000);
	 
	  driver.findElement(By.id("signin-continue-btn")).click();
	  driver.findElement(By.id("pass")).sendKeys(pwd);
	  driver.findElement(By.id("sgnBt")).click();
	 // String o=driver.findElement(By.className("no-touch")).getText();
	 
	// driver.getWindowHandle().contains(o);
	 Thread.sleep(2000);
      act = driver.findElement(By.xpath("//p[@id='signin-error-msg']")).getText();
   
      
	  fos = new FileOutputStream(file);
	  rw=sh.getRow(l);
	  cl=rw.createCell(k);
	  
	  cl.setCellValue(act); 
	  l++;
	  rw = sh.getRow(i);
	  cl = rw.createCell(j);
	 
	  if(act.equals(exp)){
	   cl.setCellValue("Pass");  
	  }
	  else{
	   cl.setCellValue("Fail");  
	  }
	  i++;
	  wb.write(fos);
	  fos.close();
	  
	 driver.navigate().back();
	 }
	 

	/*@AfterMethod
	 public void afterMethod() throws InterruptedException {
		
		//driver.navigate().back();
		Thread.sleep(2000);
	  driver.findElement(By.id("userid")).clear();
	 
		
	  driver.findElement(By.id("signin-continue-btn")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.id("pass")).clear();
	 }*/
	 @DataProvider
	 public Object[][] getData() {
	  rowCount = sh.getPhysicalNumberOfRows();//7-1=6->rowCount-1
	  colCount = sh.getRow(0).getPhysicalNumberOfCells();//5
	  
	  Object [][]data = new Object[rowCount-1][colCount-3];//[5][2]
	  for(row=0; row<rowCount-1; row++){ 
	   rw = sh.getRow(row+1);//row+1 as we want data from 1st row and not from 0th row.
	   for(col=0;col<colCount-3;col++){//colcount-1 as we want data from 0th & 1st column.
	    cl = rw.getCell(col);
	    data[row][col]= cl.getStringCellValue();
	   }
	  }
	  return data;
	 }
	
	@BeforeTest
	 public void beforeTest() throws IOException {
		  file = new File("E:\\ExcelFile\\MyExcel5.xls");
			
	  fis = new FileInputStream(file);
	  wb = new HSSFWorkbook(fis);
	  sh=wb.getSheetAt(0);//return the first sheet
	 
	  System.setProperty("webdriver.chrome.driver","E:\\Chrome90\\chromedriver_win32\\chromedriver.exe");
	//  System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (1)\\chromedriver.exe");
	  driver=new ChromeDriver();
	 
	  driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.findElement(By.partialLinkText("Sign in")).click();
		
			
	 }
	 @AfterTest
	 public void afterTest() throws IOException {
	  driver.close();
	  wb.close();
	  fis.close();
	 }
}

