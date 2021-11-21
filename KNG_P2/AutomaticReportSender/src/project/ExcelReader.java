package project;

import java.io.FileInputStream;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	public void ReadAndSend(int sheetno,String date) throws Exception {
		 ArrayList<String> email=new ArrayList<String>();
		 email.add("m.sohail414@gmail.com");
		 email.add("coolrafiq143@gmail.com");
		 String ExcelFile="D:\\Data\\rawData\\Report-"+date+".xlsx";
		 FileInputStream fis= new FileInputStream(ExcelFile);
		 XSSFWorkbook workbook=new XSSFWorkbook(fis);
		 XSSFSheet sheet = null;
		 
		 sheet= workbook.getSheetAt(sheetno);
		 
		 int rows=sheet.getLastRowNum();
		 int cols=sheet.getRow(1).getLastCellNum();
		 ArrayList<String> d=new ArrayList<String>();
		 ArrayList<String> mcno=new ArrayList<String>();
		 ArrayList<String> ft=new ArrayList<String>();
		 ArrayList<String> pd=new ArrayList<String>();
		 ArrayList<String> at=new ArrayList<String>();
		 ArrayList<String> ot=new ArrayList<String>();
		 ArrayList<String> dt=new ArrayList<String>();
		 ArrayList<String> pi=new ArrayList<String>();
		for (int i = 1; i <=rows; i++) {
			XSSFRow row=sheet.getRow(i);
				for (int j=0;j<=cols;j++) {
					Cell VAL=row.getCell(j);
					switch (j){
					case 0:
						d.add(VAL.getStringCellValue());				
					break;
					case 1:
						mcno.add(VAL.getStringCellValue());				
					break;
					case 2:
						ft.add(VAL.getStringCellValue());				
					break;
					case 3:
						pd.add(VAL.getStringCellValue());				
					break;
					case 4:
						at.add(VAL.getStringCellValue());				
					break;
					case 5:
						ot.add(VAL.getStringCellValue());				
					break;
					case 6:
						dt.add(VAL.getStringCellValue());				
					break;
					case 7:
						pi.add(VAL.getStringCellValue());				
					break;
					default:
						break;
					}
				}
		}
		 workbook.close();
		 PdfGenerator PG=new PdfGenerator();
		 for (int i = 0; i < d.size(); i++) {
				PG.create(d.get(i),mcno.get(i),ft.get(i), pd.get(i), at.get(i), ot.get(i),dt.get(i),pi.get(i));
		}
		 EmailSender ES=new EmailSender();
		 System.out.println("Sending e-mails ");
		 for (int i = 0; i < email.size(); i++) {
			 ES.sendmail(email.get(i),mcno);
		 }	
		 System.out.println("E-mails sent successfully...");
	}
	public static String cellval(Cell cel) {
	 String S=null;
	 switch (cel.getCellType()) {
		case STRING:
			S= cel.getStringCellValue();
			break;
		case NUMERIC:
			S= String.valueOf(cel.getNumericCellValue());
			break;
		default:
		break;
		}
	return S;
	 
}
}
