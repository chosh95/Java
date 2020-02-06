package lambda;

interface PrintString{
	void showString(String str);
}

public class TestLambda {
	public static void main(String[] args) {
		//함수의 구현부를 변수로 대입
		PrintString lambdaStr = s->System.out.println(s);
		lambdaStr.showString("Test");
		
		//매개변수로 함수를 받는경우
		showMyString(lambdaStr);
		
		//반환타입을 함수로
		PrintString test = returnString();
		test.showString("Test3");
	}
	
	public static void showMyString(PrintString p) {
		p.showString("Test2");
	}

	public static PrintString returnString() {
		return s->System.out.println(s + "!!!");
	}
	
}
