package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;



public class Utility<WorkbookFactory>
{
	static Object WorkbookFactory;
	 Object file;
   public static void getexclesheet()
   {
	   String path = "D:\\software testing notes\\Janewary\\13-1-23\\Data\\Test.xlsx";
		
		try {
			InputStream file = new FileInputStream(path);
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block

			e.printStackTrace();
			
			
			String value = WorkbookFactory.create(file).getSheet("Toshvi").getRow(3).getCell(2).getStringCellValue();
			System.out.println(value);
		}
	      
	 
	   
   }

}
