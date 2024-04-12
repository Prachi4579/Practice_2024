package fileread;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadingFileAsString {

	public static void main(String[] args) {
		Path path = Paths.get("C:\\Users\\DELL\\Documents\\TechElliptica_PrachiWork\\Reading_file.txt");

		String data = "";
		try {
			data = new String( Files.readAllBytes(path));
		} catch (IOException e) {

			e.printStackTrace();
		}

		System.out.println(data);
	}
}


