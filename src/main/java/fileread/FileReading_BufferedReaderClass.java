package fileread;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReading_BufferedReaderClass {

	public static void main(String[] args) {
		String path="C:\\Users\\DELL\\Documents\\TechElliptica_PrachiWork\\Reading_file.txt";
		File file=new File(path);
		FileReader fil=null;
		try {
			fil = new FileReader(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int count=0;
		BufferedReader br=new BufferedReader(fil);
		try {
			while((count=br.read())!=-1) {
				System.out.print((char)count);

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

