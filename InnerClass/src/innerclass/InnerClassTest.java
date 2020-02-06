package innerclass;

class OutClass{
	
	private int num = 10;
	private static int sNum = 20;
	private InClass inclass;
	
	//외부 클래스 생성자에서 내부 클래스 생성 가능
	public OutClass() {
		inclass = new InClass();
	}
	
	//인스턴스 내부 클래스
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
	
	//정적 내부 클래스
	static class InStaticClass{
		int inNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			System.out.println(inNum);
			System.out.println(sInNum);
		}
		
		static void sTest() {
			// System.out.println(inNum); static이 아니면 불가능
			System.out.println(sNum); //외부 클래스의 static 변수
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
		sInClass.inTest(); //static 메소드가 아니기 때문에 인스턴스 생성 후 호출
		
		OutClass.InStaticClass.sTest(); //static 메소드는 인스턴스 없이 호출 가능.
		
		
	}

}
