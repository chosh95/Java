package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest2 {

	public static void main(String[] args) {

		try(AutoCloseObj obj = new AutoCloseObj()){
			throw new Exception();
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
