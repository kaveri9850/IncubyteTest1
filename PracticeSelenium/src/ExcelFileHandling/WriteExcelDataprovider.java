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

public class WriteExcelDataprovider {
	
	File file;
	FileOutputStream fos;
	FileInputStream  ios;
	HSSFWorkbook wb;
	HSSFSheet sh,sh1;
	HSSFRow row;
	HSSFCell cell;
	String fpath="E:\\ExcelFile\\MyExcel2.xls";
	int i=0,j=0;
  @Test(dataProvider = "dp")
  public void WritingData(String n, String s) {
	  
	  
	  sh=wb.getSheet("My Sheet");
	  row=sh.createRow(i);
	  cell=row.createCell(j);
	  cell.setCellValue(n);
	  cell=row.createCell(j+1);
	  cell.setCellValue(s);
	  i++;
	  
  }
  @Test
  public void WritingData1()
  {
	  
	  sh=wb.getSheet("My Sheet1");
	  for(int i=0;i<5;i++)
	  {
		  row=sh.createRow(i);
		  for(int j=0;j<2;j++)
		  {
			  cell=row.createCell(j);
			  cell.setCellValue("Row"+i+"column"+j); 
		  }
	  }
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
    
   /* Object [][] data =new Object[3][2];
	data[0][0]="kaveri";
	data[0][1]="kaveri";
	data[1][0]="Saurabh";
	data[1][1]="Saurbh";
	data[2][0]="Love";
	data[2][1]="Love";
	return data;*/
	
  }
  @BeforeTest
  public void beforeTest() throws FileNotFoundException {
		file=new File(fpath);
		fos=new FileOutputStream(file);
		wb=new HSSFWorkbook();
		sh=wb.createSheet("My Sheet");
		sh=wb.createSheet("My Sheet1");
		
		
		
  }

  @AfterTest
  public void afterTest() throws IOException {
	  wb.write(file);
	  fos.close();
	  wb.close();
	  System.out.println("Done!!!");
  }
}
