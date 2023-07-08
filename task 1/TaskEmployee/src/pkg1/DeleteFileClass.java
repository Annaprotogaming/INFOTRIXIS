package pkg1;

import java.io.File;

public class DeleteFileClass {
	public static void main(String[] args) {
		File MyFile = new File ("dataemp.txt");
		
		if (MyFile.delete() ) {
			
			System.out.println("File deleted ."+MyFile.getName()+"  successfully");
		}
		else {
			System.out.println("Failed to delete a file");
		}
	}

}
