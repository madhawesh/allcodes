package firstexcel.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class looping {

	public static void main(String[] args) throws Exception {
		File src1=new File("C:\\Users\\madhwesh\\workspace\\excel\\excel\\testdata.xls");
		//FileInputStream fis=new FileInputStream(src1);
		FileInputStream fs=new FileInputStream(src1);
		//for clsx XSSFworkbook=new XSSFworkbook(fis);
		//HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFWorkbook wb=new HSSFWorkbook(fs);
		HSSFSheet sheet2=wb.getSheetAt(1);
		for(int i=1;i<=19;i++){
			for(int j=0;j<=1;j++){
		//String data1=sheet2.getRow(i).getCell(i).getStringCellValue();
		System.out.print(sheet2.getRow(i).getCell(j).getStringCellValue());
		System.out.print("   ");
		}
		}
	}

}
