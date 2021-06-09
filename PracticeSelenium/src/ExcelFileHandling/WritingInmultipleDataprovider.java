package ExcelFileHandling;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.annotations.AfterTest;

public class WritingInmultipleDataprovider {
	File file;
	FileOutputStream fos;
	FileInputStream  ios;
	HSSFWorkbook wb;
	HSSFSheet sh;
	HSSFRow row;
	HSSFCell cell;
	String fpath="E:\\ExcelFile\\MyExcel3.xls";
	int i=0,j=0;
  @Test(dataProvider = "dp")
  public void writingData(String n, String s) {
	  
	  row=sh.createRow(i);
	  cell=row.createCell(j);
	  cell.setCellValue(n);
	  cell=row.createCell(j+1);
	  cell.setCellValue(s);
	  i++;
	  
  }

  @DataProvider
  public Object[][] dp() {
    Object [][] data =new Object[5][2];
    data[0][0]="Kaveri";
    data[0][1]="Kaveri";
    data[1][0]="Saurabh";
    data[1][1]="Saurabh";
    data[2][0]="Kaveri";
    data[2][1]="Kaveri";
    data[3][0]="Love";
    data[3][1]="Love"; 
    data[4][0]="Hate";
    data[4][1]="hate"; 
    return data;
  }
  @BeforeTest
  public void beforeTest() throws FileNotFoundException {
		file=new File(fpath);
		fos=new FileOutputStream(file);
		wb=new HSSFWorkbook();
		sh=wb.createSheet("My Sheet");
		//sh=wb.createSheet("My Shett");
		
  }

  @AfterTest
  public void afterTest() throws IOException {
	  wb.write(file);
	  fos.close();
	  wb.close();
	  System.out.println("Done!!!");
  }

}
