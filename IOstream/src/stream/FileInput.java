package stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInput {

	public static void main(String[] args) {

		
		try(FileInputStream fis = new FileInputStream("input.txt")) {			
			int i;
			while((i=fis.read()) != -1) {
				System.out.print((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
