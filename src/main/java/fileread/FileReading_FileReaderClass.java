package fileread;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReading_FileReaderClass {
	public static void main(String[] args) {
			readFile(System.getProperty("user.dir")+"//Reading_file.txt") ;
		
		
		}

	public static void readFile(String path){
		FileReader filRead=null;
		try {
			 filRead=new FileReader(path);
			System.out.println("File contains");
			
			int count=0;
			while((count=filRead.read() )!=-1) {
				System.out.print((char)count);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				filRead.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		}
	}

