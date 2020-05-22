package decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {

		long timeCnt = 0;
		try(FileInputStream fis = new FileInputStream("content.json");
				FileOutputStream fos = new FileOutputStream("copy.json");
				BufferedInputStream bis = new BufferedInputStream(fis);
				BufferedOutputStream bos = new BufferedOutputStream(fos)){
			
			timeCnt = System.currentTimeMillis();
			int i;
			while((i = bis.read())!=-1) {
				bos.write(i);
			}
			
			timeCnt = System.currentTimeMillis() - timeCnt;
		}catch(IOException e) {
			System.out.println(e);
		}
		System.out.println("In FileInput/outputStream : 6083");
		System.out.println("In BufferedInput/outputStream : 62");
		System.out.println(timeCnt);
	}

}