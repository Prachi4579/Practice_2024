package fileread;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadingUsingScannerClass {


	public static void main(String[] args) {
		File file=new File(System.getProperty("user.dir")+"//Reading_file.txt");

		try {

			Scanner myReader=new Scanner(file);
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

}



