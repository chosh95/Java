package stream;

import java.io.IOException;
import java.io.InputStreamReader;

public class IOTest2 {

	public static void main(String[] args) {

		System.out.println("�Է��ϼ��� : ");
		try {
			int i;
			InputStreamReader isr = new InputStreamReader(System.in);
			while((i = isr.read()) != '��') {
				System.out.print((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
