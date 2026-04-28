package apache_programs;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/* program to read the data from excel */
public class p1 {
	public static void main(String[] args) throws Throwable {
		/*FileInputStream f = new FileInputStream("./data/ElorusData.xlsx");
		Workbook book = WorkbookFactory.create(f);
		Sheet x = book.getSheet("demo");
		String d1 = x.getRow(0).getCell(0).getStringCellValue();
		String d2 = x.getRow(1).getCell(0).getStringCellValue();
		String d3 = x.getRow(2).getCell(0).getStringCellValue();
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3); */


		FileInputStream f1= new FileInputStream("C:\\Users\\sushm\\OneDrive\\Desktop\\Sample.xlsx");
		Workbook book1 = WorkbookFactory.create(f1);
		Sheet sam= book1.getSheet("Sample");
		for(int i=0; i<4;i++) {
			for(int j=0; j<3;j++)
			{
				/*if (sam.getRow(i).getCell(j).getCellType() == CellType.STRING) 
				{
					System.out.print(sam.getRow(i).getCell(j).getStringCellValue()+" "); 
				} 
				else if (sam.getRow(i).getCell(j).getCellType() == CellType.NUMERIC) 
				{ 
					System.out.print(String.valueOf(sam.getRow(i).getCell(j).getNumericCellValue())+" "); 
				}*/
				System.out.print(sam.getRow(i).getCell(j).getCellType() == CellType.STRING?sam.getRow(i).getCell(j).getStringCellValue()+" ":String.valueOf(sam.getRow(i).getCell(j).getNumericCellValue())+" ");
			}
			System.out.println(); 
		}
	}
}

