package Reusable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import TestBase.DriverFactory;

public class Utlity {
	public static Workbook book;
	public static Sheet sheet;
	
	public static String takeScreenshot(String methodName) {
		SimpleDateFormat format=new SimpleDateFormat("dd-mm-yy hh-mm-ss");
		Date date=new Date();
		String actaulDate=format.format(date);
		String path="C:\\Users\\Raviraj\\eclipse-workspace\\Framework6\\Screenshots\\"+methodName+".png";
		
		TakesScreenshot scn=(TakesScreenshot) DriverFactory.getInstance().getDriver();
		File sourceFile=scn.getScreenshotAs(OutputType.FILE);
		File file=new File(path);
		try {
			FileUtils.copyFile(sourceFile, file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return path;
	}
	
	public static void windowHandle() {
		String mainWindow=DriverFactory.getInstance().getDriver().getWindowHandle();
		Set<String> allWindows=DriverFactory.getInstance().getDriver().getWindowHandles();
		Iterator itr=allWindows.iterator();
		while(itr.hasNext()) {
			String child=(String) itr.next();
			DriverFactory.getInstance().getDriver().switchTo().window(child);
			if(!child.equalsIgnoreCase(mainWindow)) {
				
			}
		}
	}
	
	public static void switchToFrame(String frameName) {
		DriverFactory.getInstance().getDriver().switchTo().frame(frameName);
	}
	
	public static Object[][] getTestData(String sheetName) {
		String path="C:\\Users\\Raviraj\\eclipse-workspace\\Framework6\\src\\main\\java\\TestData\\newTestData.xlsx";
		File file=new File(path);
		try {
			FileInputStream fis=new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			book=new XSSFWorkbook(file);
		} catch (InvalidFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sheet=book.getSheet(sheetName);
		
		Object data[][]=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for(int i=0;i<sheet.getLastRowNum();i++) {
			for(int j=0;j<sheet.getRow(0).getLastCellNum();j++) {
				try{data[i][j]=sheet.getRow(i+1).getCell(j).getStringCellValue();
				
				}catch(NullPointerException e) {
					
				}
			}
		}return data;
		
	}

}
