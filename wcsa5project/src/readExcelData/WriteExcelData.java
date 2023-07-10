package readExcelData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteExcelData {

	public static void main(String[] args)throws EncryptedDocumentException,IOException, EncryptedDocumentException,IOException {
		//write the data in excel sheet..
		FileInputStream fis = new FileInputStream("./Data/TestData.xlsx");
		 Workbook wb = WorkbookFactory.create(fis);
		 Sheet sheet = wb.getSheet("IPL");
		 Row row = sheet.getRow(1);
	     Cell cell = row.createCell(2);
	     cell.setCellValue("pune1");
	     
	     FileOutputStream fos = new FileOutputStream("./Data/TestData.xlsx");
	     wb.write(fos);
	}

}
