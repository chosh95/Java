package lambda;

public class StringConCatTest {

	public static void main(String[] args) {
		//���� ���
		StringConcat_2 str2 = new StringConcat_2();
		str2.makeString("hi" , "world");
		
		//���ٽ� ���
		StringConcat concat = (s , v) -> System.out.println(s + "," + v);
		concat.makeString("Hi", "World");
	}
}
