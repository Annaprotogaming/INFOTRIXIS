package pkg1;
import java.io.File;
import java.io.IOException;
public class CreateFile {
	public static void main(String[] args) {
		File myFile = new File("dataemp.txt");
		
	try {
		if(myFile.createNewFile()) {
			System.out.println("File created succesfully");
		}
		else {
			System.out.println("file creation error");
		}
	} catch (IOException ex) {
		
	System.out.println("File error....");
	}
	
	}


