package File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

public class ReadingFile {

	public static void main(String[] args) throws IOException {

		File f = new File("C:\\nikini wassa\\mytextFile.txt");
		FileReader fw = new FileReader(f);// when we give trtue it not override file it will add new lines every time

		BufferedReader Reader = new BufferedReader(fw);

		String linr = null;

		while ((linr = Reader.readLine())!= null){
			System.out.println(linr);
		}
		Reader.close();

	}

}
