package innerclass;

class OutClass{
	
	private int num = 10;
	private static int sNum = 20;
	private InClass inclass;
	
	//�ܺ� Ŭ���� �����ڿ��� ���� Ŭ���� ���� ����
	public OutClass() {
		inclass = new InClass();
	}
	
	//�ν��Ͻ� ���� Ŭ����
	class InClass{
		int iNum = 30;
		
		void inTest() {
			System.out.println(num);
			System.out.println(sNum);
			System.out.println(iNum);
		}
	}
	
	public void usingInner() {
		inclass.inTest();
	}
	
	//���� ���� Ŭ����
	static class InStaticClass{
		int inNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			System.out.println(inNum);
			System.out.println(sInNum);
		}
		
		static void sTest() {
			// System.out.println(inNum); static�� �ƴϸ� �Ұ���
			System.out.println(sNum); //�ܺ� Ŭ������ static ����
			System.out.println(sInNum);
		}
		
	}
	

}


public class InnerClassTest {

	public static void main(String[] args) {
		OutClass outclass = new OutClass();
		outclass.usingInner();
		
		OutClass.InClass outinclass = outclass.new InClass();
		outinclass.inTest();
		
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		sInClass.sTest();
		sInClass.inTest(); //static �޼ҵ尡 �ƴϱ� ������ �ν��Ͻ� ���� �� ȣ��
		
		OutClass.InStaticClass.sTest(); //static �޼ҵ�� �ν��Ͻ� ���� ȣ�� ����.
		
		
	}

}
