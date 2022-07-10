package excel.tests;

import com.excel.Xls_Reader;

public class ExcelUtilTest {
	public static void main( String[] args) {
Xls_Reader reader = new Xls_Reader("C:\\Users\\PC\\Desktop\\DummyData.xlsx");
	 String sheetName ="Data";
			String Dat= reader.getCellData(sheetName, 0, 2);
			 System.out.println(Dat);
			 
}
}
