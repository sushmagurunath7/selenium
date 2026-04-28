 package apache_programs;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/* program to write data in Excel */
public class p3 {
	public static void main(String[] args) throws Throwable {
		FileInputStream f = new FileInputStream("./data/ElorusData.xlsx");
		Workbook book = WorkbookFactory.create(f);
		Sheet newsheet = book.createSheet("Student");
		
		Row firstRow = newsheet.createRow(0);
		firstRow.createCell(0).setCellValue("StudentName");
		firstRow.createCell(1).setCellValue("PhoneNumber");
		
		Row secondRow = newsheet.createRow(1);
		secondRow.createCell(0).setCellValue("Sushma");
		secondRow.createCell(1).setCellValue("6656892787");
		
		FileOutputStream g = new FileOutputStream("./data/ElorusData.xlsx");
		book.write(g);
	}

}
