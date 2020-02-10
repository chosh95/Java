package outputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputTest1 {

	public static void main(String[] args) {

		try(FileOutputStream fos = new FileOutputStream("output.txt", true);) { //true�ϸ� ��� append�ؼ� ���� �ȴ�. 
			fos.write(65);
			fos.write(66);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
