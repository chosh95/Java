package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {

	public Class loadCloass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException{
		FileInputStream fil = new FileInputStream(fileName);
		Class c = Class.forName(className);
		return c;
	}
	
	public static void main(String[] args) {

		ThrowsException test = new ThrowsException();
		
		try {
			test.loadCloass("b.txt", "java.lang.String");
		}catch(FileNotFoundException e) {
			System.out.println(e);
		}catch(ClassNotFoundException e) {
			System.out.println(e);
		}catch(Exception e) { //exception은 최상위 클래스라 마지막에 해야한다. 
			System.out.println(e);
		}
		
	}

}
