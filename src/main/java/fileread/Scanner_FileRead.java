package fileread;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Scanner_FileRead {
public static void main(String[] args) {
	String path="C:\\Users\\DELL\\Documents\\TechElliptica_PrachiWork\\Reading_file.txt";
	File file=new File(path);
	try {
		Scanner scan=new Scanner(file);
		while(scan.hasNextLine()) {
			System.out.println(scan.nextLine());
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
