package stream;

import java.io.IOException;

public class IOTest {

	public static void main(String[] args) {

		System.out.println("�Է��ϼ��� : ");
		int i;
		try {
			i = System.in.read();
			System.out.println(i);
			System.out.println((char)i);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
