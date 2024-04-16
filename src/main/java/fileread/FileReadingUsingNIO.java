package fileread;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReadingUsingNIO {

	public static void main(String[] args) {


		Path filePath = Paths.get(System.getProperty("user.dir")+"//Reading_file.txt");

		try {
			// Read all lines from the file into a list
			List<String> lines = Files.readAllLines(filePath);

			// Print each line
			for (String line : lines) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}



