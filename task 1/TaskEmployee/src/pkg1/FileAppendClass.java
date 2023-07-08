package pkg1;

import java.io.FileWriter;
import java.io.IOException;

public class FileAppendClass {
	public static void main(String[] args) {
		String data = ",India, pin- 415501";
		try {
			FileWriter output = new FileWriter("dataemp.txt",true);
			output.write(data);
			System.out.println("data appended/Updated ");
			output.close();
		} catch (IOException ex) {
			
			System.out.println();
		}
	}

}
