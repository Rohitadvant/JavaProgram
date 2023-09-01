package Practice2;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=0; i<n;i++) {
		getData("Sheet1", i, 1);
		}
	}
public static void getData(String sheet , int r, int c) throws IOException {
	FileInputStream fis= new FileInputStream("C:\\Users\\rkroh\\Desktop\\Test.xlsx");
	XSSFWorkbook xw=new XSSFWorkbook(fis);
	XSSFSheet xs=xw.getSheet(sheet);
	System.out.println(xs.getRow(r).getCell(c));
}
}
