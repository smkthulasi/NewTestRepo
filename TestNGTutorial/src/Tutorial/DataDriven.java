package Tutorial;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataDriven {

	public Object[][] Getinput() throws BiffException, IOException {
		// TODO Auto-generated method stub
		File f =  new File("C:/sarala/Book1.xls");
		Workbook wb1= Workbook.getWorkbook(f);
		Sheet sh=wb1.getSheet(0);
		int rows=sh.getRows();
		System.out.println(rows);
		int col=sh.getColumns();
		System.out.println(col);
		
		String inputdata[][]=new String[rows][col];
		for(int i=0;i<rows;i++){
			for(int j=0;j<col;j++){
				Cell c1=sh.getCell(j,i);
				inputdata[i][j]=c1.getContents();
				System.out.println(inputdata[i][j]);
			}
		}
	
		return inputdata;

	}

}
