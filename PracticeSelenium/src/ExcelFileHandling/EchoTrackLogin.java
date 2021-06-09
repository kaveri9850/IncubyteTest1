package ExcelFileHandling;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
//test same functionality test with different data is called data driven test
public class EchoTrackLogin {
	File file;
	FileOutputStream fos;
	FileInputStream  ios;
	HSSFWorkbook wb;
	HSSFSheet sh,sh1;
	HSSFRow row;
	HSSFCell cell;
	String fpath="E:\\ExcelFile\\MyExcel4.xls";
	String expmsg="Invalid Username/Password" ,act ;
	int rowCount,colcount,rw,col=0;
	int i=1,j=2;
	
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void loginEchotrack(String un, String pw) {
	
	  driver.findElement(By.id("txtCustomerID")).sendKeys(un);
	  driver.findElement(By.id("txtPassword")).sendKeys(pw);
	  driver.findElement(By.id("Butsub")).click();
	String errormsg=  driver.findElement(By.id("lblMsg")).getText();
	Assert.assertEquals(errormsg, expmsg);
	
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
	  driver.findElement(By.id("txtCustomerID")).clear();
	
  }


  @DataProvider
  public Object[][] dp() {
   /* return new Object[][] {
      new Object[] { "kaveri", "kaveri" },
      new Object[] { "Saurabh", "Saurabh" },
      new Object[] { "Love", "Love" }, };*/
    	Object [][] data =new Object[3][2];
    	data[0][0]="kaveri";
    	data[0][1]="kaveri";
    	data[1][0]="Saurabh";
    	data[1][1]="Saurbh";
    	data[2][0]="Love";
    	data[2][1]="Love";
    	return data;
    	
  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (1)\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("http://www.echotrak.com");
  }

  @AfterTest
  public void afterTest() {
	  
	  driver.close();
  }
  

}
