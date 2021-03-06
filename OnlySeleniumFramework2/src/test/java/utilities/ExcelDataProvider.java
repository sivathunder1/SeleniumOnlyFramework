package utilities;

import org.junit.Test;
import org.testng.annotations.DataProvider;

public class ExcelDataProvider {
	
	//@Test(dataProvider = "test1Data")
	public void test1(String userName, String password){
		
	}
	

	@DataProvider(name = "test1Data")
	public static Object[][] getData() {
		String filePath = "C:\\Users\\sivaram\\workspace\\TagitSeleniumFramework\\excel\\Data.xlsx";
		Object[][] testData = testData(filePath, "Sheet1");
		return testData;
	}

	public static Object[][] testData(String excelPath, String sheetName) {
		ExcelUtils excel = new ExcelUtils(excelPath, sheetName);
		int rowCount = excel.getRowCount();
		int colCount = excel.getColCount();

		Object data[][] = new Object[rowCount - 1][colCount];

		for (int i = 1; i < rowCount; i++) {
			for (int j = 0; j < colCount; j++) {
				String cellData = excel.getCellDataString(i, j);
				System.out.println(cellData);
				data[i - 1][j] = cellData;
			}
		}
		return data;
	}
}
