package ExcelFileHandling;

import org.testng.annotations.Test;
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

public class WritingnsingleCell {
	File file;
	FileOutputStream fos;
	FileInputStream  ios;
	HSSFWorkbook wb;
	HSSFSheet sh;
	HSSFRow row;
	HSSFCell cell;
	String fpath="E:\\ExcelFile\\MyExcel1.xls";
  @Test
  public void WritingData() {
	 /* for(int i=0;i<5;i++)
	  {
		  row=sh.createRow(i);
		  for(int j=0;j<4;j++)
		  {
			  cell=row.createCell(j);
			  cell.setCellValue("Row"+i+"column"+j); 
		  }
	  }*/
	 row=sh.createRow(0);
	  cell=row.createCell(0);
	  cell.setCellValue("MY Cell first"); 
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() throws FileNotFoundException {
		file=new File(fpath);
		fos=new FileOutputStream(file);
		
		wb=new HSSFWorkbook();
		sh=wb.createSheet("My Sheet");
		//sh=wb.createSheet("My Shett");
		ios=new FileInputStream(file);
		
		
  }

  @AfterTest
  public void afterTest() throws IOException {
	  wb.write(file);
	 
	
	
	  
	  fos.close();
	  wb.close();
	  System.out.println("Done!!!");
  }

}
