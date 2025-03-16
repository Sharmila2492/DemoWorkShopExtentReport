package ExcelReadDAta;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws IOException {
		Workbook book= new XSSFWorkbook("filepath");
		//Get to the sheet
		
		Sheet sheet = book.getSheetAt(0);
		//get the no. of rows
		
		int rowCount = sheet.getLastRowNum();
		
		//get the no. of columns
		
		int columnCount = sheet.getRow(0).getLastCellNum();
		
		//iterate and get the cell value
		
		String[][] data = new String[rowCount][columnCount];
		
		for(int i=0;i<=rowCount;i++)   //i=1 when you want to ignore the heading
		{
			Row row =sheet.getRow(i);
			
			//get into column
			
			for(int j=0;j<columnCount;j++)
			{
				Cell cell = row.getCell(j);
				
				//read/get the value
				
				System.out.println(cell.getStringCellValue());
				
				//to store in array
				
				data[i-1][j] = cell.getStringCellValue(); //i=i-1=0, j=0
				
			}
			
			System.out.println();
		}
		
		for(String[] row : data) {
			
			for(String x : row)
			{
				System.out.println(x+" ");
			}
		}
		
		book.close();
	}
}
	