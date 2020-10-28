package SauceDemo.Utilities;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SauceDemoExcelReader 
{
	File f;
	FileInputStream fis;
	XSSFWorkbook wb;
	public SauceDemoExcelReader() throws Exception
	{
		f=new File(".\\src\\main\\java\\SauceDemo\\ExcelData\\SauceDemo.xlsx");
		fis=new FileInputStream(f);
		wb=new XSSFWorkbook(fis);
	}
	public int row(String sheetname)
	{
		int row=wb.getSheet(sheetname).getLastRowNum()+1;
		System.out.println(row);
		return row;
	}
	public short col(String sheetname)
	{
		short col=wb.getSheet(sheetname).getRow(0).getLastCellNum();
		System.out.println(col);
		return col;
	}
	public String GetData(String sheetname,int row, int col)
	{
		String data=wb.getSheet(sheetname).getRow(row).getCell(col).getStringCellValue();
		return data;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
