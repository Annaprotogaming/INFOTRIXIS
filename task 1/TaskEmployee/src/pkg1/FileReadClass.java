package pkg1;

import java.io.FileReader;
import java.io.IOException;

public class FileReadClass {
	public static void main(String[] args) {
	char[] data	= new char[50]; // can store upto 40 characters
	try {
		FileReader input = new FileReader("dataemp.txt");
		input.read(data);
		System.out.println("data recieved from a file");
		System.out.println(data);
		input.close();
	} catch (IOException ex) {
		
		System.out.println("File read error...");
	}
	
	
	}

}
