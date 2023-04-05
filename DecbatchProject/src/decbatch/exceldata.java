package decbatch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class exceldata {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		String projectpath=System.getProperty("user.dir");
		System.out.println("The project path is:"+projectpath);
		String excelpath=projectpath+"\\data.xlsx";
		FileInputStream input1=new FileInputStream(excelpath);
		
	}

}
