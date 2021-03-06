package decorator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStream {

	public static void main(String[] args) {

		try(FileOutputStream fos = new FileOutputStream("data.txt");
			FileInputStream fis = new FileInputStream("data.txt");
			DataInputStream dis = new DataInputStream(fis);
			DataOutputStream dos = new DataOutputStream(fos)){
			
			dos.writeByte(1010);
			dos.writeChar('X');
			
			System.out.println(dis.readByte()); //입,출력 형식 똑같이 해야 똑같이 출력됨
			System.out.println(dis.readChar());
			
		} catch (IOException e) {
		}
	}

}
