package fileread;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadingUsingScannerClass {


	public static void readFile(String filePath){

		try {
			File myObj=new File(filePath);
			Scanner myReader=new Scanner(myObj);
			while(myReader.hasNextLine()){ 	
				String data=myReader.nextLine();
				System.out.println(data);
			}
			myReader.close();
		}



		catch(FileNotFoundException e)
		{
			System.out.println("An error occured while reading..");
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		String filePath="C:\\Users\\DELL\\Documents\\TechElliptica_PrachiWork\\Reading_file.txt";
		readFile(filePath) ;


	}
}



