package Demo;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ReadDataFromExcel {
@Test
public void test() throws IOException {
FileInputStream fis = new FileInputStream("C:\\Users\\91934\\OneDrive\\Desktop\\vacancies1.xlsx");
Workbook workbook = WorkbookFactory.create(fis);
Sheet sheet =workbook.getSheet("AddVacancy");
for(int i =1;i <= sheet.getLastRowNum();i++) {
	String vacancyName  = sheet.getRow(i).getCell(1).getStringCellValue();
    System.out.println(vacancyName);
}

workbook.close();
	
}
}
