package stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareStr implements BinaryOperator<String>{

	@Override
	public String apply(String s1, String s2) {
		 return s1.length()>s2.length() ? s1 : s2;
	}
	
}

public class InArrayTest {

	public static void main(String[] args) {
		  String[] str = {"hi", "every", "one", "myName"};
		  System.out.println(Arrays.stream(str).reduce("",(s1,s2)->{
			  return s1.length()>s2.length() ? s1 : s2;
		  }));
		  
		  System.out.println(Arrays.stream(str).reduce(new CompareStr()).get());
	}

}
