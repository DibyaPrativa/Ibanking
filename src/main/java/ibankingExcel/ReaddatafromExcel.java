package ibankingExcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReaddatafromExcel {

	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream("C://Users//DIBYAJYOTI//Desktop//Employeedetails.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("sheet1");
		int rowcount=sheet.getLastRowNum();//return row count
		int colcount=sheet.getRow(0).getLastCellNum();    //returncolumn/cellcount
		for(int i=0;i<rowcount;i++) {
		XSSFRow	currentrow=sheet.getRow(i);   //focus on current row
		for(int j=0;j<colcount;j++) {
			String value=currentrow.getCell(j).toString(); //read value from the cell
			System.out.print(" "  +value);
		}
		System.out.println();
		
		}
		
		

	}

}
