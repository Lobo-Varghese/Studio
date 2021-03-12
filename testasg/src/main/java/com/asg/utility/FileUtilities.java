package com.asg.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

import cucumber.api.cli.Main;

public class FileUtilities {

	public static ArrayList<String> getdata(String val) throws IOException {
		File file = new File("C:\\Studio Auto\\UIModeldata.xlsx");
		String filename = "UIModeldata.xlsx";
		Workbook Workbookg = null;
		FileInputStream inputstream = new FileInputStream(file);
		String fileExtensionName = filename.substring(filename.indexOf("."));
		if (fileExtensionName.equals(".xlsx")) {
			Workbookg = new XSSFWorkbook(inputstream);
		}
		else if (fileExtensionName.equals(".xls")) {
			Workbookg = new HSSFWorkbook(inputstream);

		}

		Sheet sheet = Workbookg.getSheet("Sheet1");
//	    Sheet sheet1=Workbookg.getSheetAt(0);
		Iterator<Row> rowiterator = sheet.iterator();
		ArrayList<String> arr = new ArrayList<String>();
		while (rowiterator.hasNext()) {
			Row rowvalue = rowiterator.next();
			System.out.println("Rows"+ rowvalue);
//			System.out.println("Row value: " + rowvalue.getCell(0));			
			if (rowvalue.getCell(0).toString().equals(val)) {
//				System.out.println("TextBox Found");
				Iterator<Cell> celliterator = rowvalue.iterator();
				while (celliterator.hasNext()) {
					Cell cellvalue = celliterator.next();
					System.out.println("Cells: "+ cellvalue);
					arr.add(cellvalue.toString());
//					System.out.println(arr);
					//cellvalue.getStringCellValue();
					//cellvalue.getDateCellValue();
					//cellvalue.getNumericCellValue();
					
				}
				
				
			}
		}
//		System.out.println(arr);
		String ID=arr.get(1);
		String label=arr.get(2);
//		System.out.println("ID is: "+ID);
//		System.out.println("Label is: "+label);	
        return arr;
	}
	
	
	
	public static HashMap<String,String> getDataUsingFillo(String Scenario) throws FilloException {
		
		String file = "C:\\Studio Auto\\FilloExcel.xlsx";
		Fillo fillo = new Fillo();
		Connection conn = fillo.getConnection(file);
		String sqlquery = "Select * from Sheet1";
		Recordset rec = conn.executeQuery(sqlquery);
		HashMap<String,String> hm = null;
		hm = new HashMap<String,String>();
		while(rec.next()) {
			ArrayList<String> arr = rec.getFieldNames(); //return column name
			
			if(rec.getField("Scenario").equals(Scenario)) { //column name = scenario
				Iterator<String> itr = arr.iterator();			//iterate through column
				while(itr.hasNext()) {
					//System.out.println(rec.getField(itr.next())); 
					String val = rec.getField(itr.next()); //get value using column name
					if(val.contains("=")) {
						String[] splitval = val.split("=");
						//System.out.println(splitval[0]+" ,,, "+splitval[1]);
						hm.put(splitval[0], splitval[1]);
						splitval=null;
					}
				}
				//System.out.println(hm.get("type"));
			}
			
		}		
		
		rec.close();
		conn.close();
		//System.out.println(hm);
		return hm;
		
	}
}

