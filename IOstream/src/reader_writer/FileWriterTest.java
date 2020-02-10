package reader_writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) throws IOException {

		FileWriter fr = new FileWriter("writer.txt");
		fr.write('A');
		char[] bs = {'A', 'B', 'C'};
		fr.write(bs);
		fr.write("æ»≥Á«œººø‰");
		fr.close();
	}

}
