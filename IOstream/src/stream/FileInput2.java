package stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInput2 {

	public static void main(String[] args) {

		
		try(FileInputStream fis = new FileInputStream("input2.txt")) {			
			int i;
			byte[] bs = new byte[10];
			while((i=fis.read(bs)) != -1) {
				for(int j=0;j<i;j++) { //i�� ���� ������ ����Ǽ� ������ŭ ���
					System.out.print((char)bs[j]);
				}
				System.out.println();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
