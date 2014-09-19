package Auto.MProj;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.demo.Write;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

import org.testng.annotations.Test;

public class ExcelsheetHandling {
  @Test
  public void f() throws BiffException, IOException, RowsExceededException, WriteException {
	  
	/*
	  Workbook book = Workbook.getWorkbook(new File("./src/test/Book1.xls"));
	  Sheet master = book.getSheet("Master");
	  String name = master.getCell(1, 2).getContents();
	  String name1 = master.getCell(1, 1).getContents();
	  System.out.println(name1);
	  System.out.println(name);
	  book.close();
  */
	  
	/*  
	  WritableWorkbook book = Workbook.createWorkbook(new File("./src/test/Book2.xls"));
	  WritableSheet sheet = book.createSheet("Master", 0);
	  
	  Label l2 = new Label(0, 0, "Number");
	  Label l3 = new Label(1, 0, "Name");
	  Label l4 = new Label(0, 1, "1");
	  Label l1 = new Label(1, 1, "Anu");
	  Label l5 = new Label(1, 2, "Vihu");
	  sheet.addCell(l5);
	  sheet.addCell(l4);
	  sheet.addCell(l3);
	  sheet.addCell(l2);
	  sheet.addCell(l1);

	  book.write();
	  book.close();
	  */
	  
	  // modifying workbook. first reading old book and then copyinf data in new book. later reading sheet from new book and adding data
	  Workbook oldBook = Workbook.getWorkbook(new File("./src/test/Book1.xls"));
	  WritableWorkbook newBook = Workbook.createWorkbook(new File("./src/test/New.xls"), oldBook);
	  WritableSheet sheet = newBook.getSheet("Master");
	  
	  Label l1 = new Label(4,4,"Kittu");
	  sheet.addCell(l1);
	  
	  newBook.write();
	  newBook.close();
	  oldBook.close();
	  
	  
	  
  }
  
}
