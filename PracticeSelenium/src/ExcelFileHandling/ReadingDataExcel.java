package ExcelFileHandling;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;


import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.annotations.AfterTest;

public class ReadingDataExcel {
	File file;
	FileInputStream fis;
	HSSFWorkbook wb;
	HSSFSheet sh;
	HSSFRow row;
	HSSFCell cell;
	String fpath="E:\\ExcelFile\\MyExcel3.xls";
	int rowcount,clcount;
	
  @Test
  public void ReadingData() {
	  
	  rowcount=sh.getPhysicalNumberOfRows();//5
	  clcount=sh.getRow(0).getPhysicalNumberOfCells();//2
	  for(int i=0; i<rowcount;i++)
	  {
		  row=sh.getRow(i);
		  for(int j=0;j<clcount;j++)
		  {
			  cell=row.getCell(j);
			  System.out.print(cell.getStringCellValue()+"\t");
		  }
		  System.out.println();
	  }
  }
  @BeforeTest
  public void beforeTest() throws IOException {
	  file=new File(fpath);
	  fis=new FileInputStream(file);
	  wb=new HSSFWorkbook(fis);
	  sh=wb.getSheetAt(0);
  }

  @AfterTest
  public void afterTest() throws IOException {
	
	  fis.close();
	  wb.close();
	  System.out.println("Done!!!");
  }

}
