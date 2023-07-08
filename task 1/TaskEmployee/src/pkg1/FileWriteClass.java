package pkg1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteClass {
	public static void main(String[] args) {
		String data = " 101, arun pol, Shivajinagar, Maharashtra ";
		
		try {
			FileWriter output = new FileWriter("dataemp.txt");
			output.write(data);
			
			System.out.println("Data is written successfully");
			output.close();
		} catch (IOException ex) {
			
		System.out.println("File Write Error...");
		
		}
	}

}
