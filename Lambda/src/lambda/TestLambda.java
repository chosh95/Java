package lambda;

interface PrintString{
	void showString(String str);
}

public class TestLambda {
	public static void main(String[] args) {
		//�Լ��� �����θ� ������ ����
		PrintString lambdaStr = s->System.out.println(s);
		lambdaStr.showString("Test");
		
		//�Ű������� �Լ��� �޴°��
		showMyString(lambdaStr);
		
		//��ȯŸ���� �Լ���
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
