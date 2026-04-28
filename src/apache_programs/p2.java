package apache_programs;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/* program to overwrite the data */
public class p2 {
	public static void main(String[] args) throws Throwable {
		FileInputStream f = new FileInputStream("./data/ElorusData.xlsx");
		Workbook book = WorkbookFactory.create(f);
		Sheet x = book.getSheet("demo");
		x.getRow(0).getCell(0).setCellValue("Sushma");
		x.getRow(1).getCell(0).setCellValue("Katrina");
		
		FileOutputStream g = new FileOutputStream("./data/ElorusData.xlsx");
		book.write(g);
	}
}
