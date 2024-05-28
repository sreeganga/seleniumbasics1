package utilites;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExelUtilites {
	
	public static FileInputStream file;
	public static XSSFWorkbook wb;
	public static XSSFSheet sh ; 

	public static String readStringData(int i , int j, String sheet) throws IOException 
	{
		file = new FileInputStream("C:\\\\Users\\\\user\\\\git\\\\seleniumbasics1\\\\SeleniumBasic\\\\src\\\\main\\\\resources\\\\pro.xlsx" );
		wb = new XSSFWorkbook(file);
		sh= wb.getSheet(sheet);
		XSSFRow row = sh.getRow(i);
		XSSFCell cell = row.getCell(j);
		return cell.getStringCellValue();
		
		
	}
		public static String readIntegerData(int i, int j, String sheet) throws IOException 
		{
			file = new FileInputStream("C:\\Users\\user\\git\\seleniumbasics1\\SeleniumBasic\\src\\main\\resources\\pro.xlsx" );
			wb = new XSSFWorkbook(file);
			sh= wb.getSheet(sheet);
			XSSFRow row = sh.getRow(i);
			XSSFCell cell = row.getCell(j);
			int x = (int) cell.getNumericCellValue();
			return String.valueOf(x); // convert to String .valueof
			
		}

}
