package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	public String getdatafromexcel() throws EncryptedDocumentException, IOException {
		FileInputStream fis =new FileInputStream("/.src/test/resources/TestScriptData.xlxs");
		Workbook workbook = WorkbookFactory.create(fis);
		return workbook.getSheet(null).getRow(0).getCell(0).getStringCellValue();
		
		/**This method is used to read boolean data from excel
		 * @param sheet name
		 */
	}

}
