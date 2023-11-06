package genericlibrery;
/**
 *@Kiran
 */
import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

import com.mysql.cj.result.Row;
/**
 * This Method is Used to Read The Data From Excel Sheet
 */
public class ExcelUtility implements IAutoConstants {
	Workbook workbook;
	@DataProvider(name="data")
	public Object[][] ReadingData() {
		File file=new File(EXCEL_PATH);
		try {
			workbook = WorkbookFactory.create(file);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Sheet sheet = workbook.getSheet("sheet1");
		int rowcount = sheet.getPhysicalNumberOfRows();
		int cellCount = sheet.getRow(0).getPhysicalNumberOfCells();
		Object[][] data=new Object[rowcount][cellCount];
		for(int row=0;row<rowcount;row++) {
			org.apache.poi.ss.usermodel.Row actrow = sheet.getRow(row);
			for(int cell=0;cell<actrow.getPhysicalNumberOfCells();cell++) {
				data[row][cell]=actrow.getCell(cell).toString();
			}
		}
		return data;
	}
}
