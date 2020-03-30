package lambda;

public class StringConCatTest {

	public static void main(String[] args) {
		//기존 방식
		StringConcat_2 str2 = new StringConcat_2();
		str2.makeString("hi" , "world");
		
		//람다식 방식
		StringConcat concat = (s , v) -> System.out.println(s + "," + v);
		concat.makeString("Hi", "World");
	}
}
