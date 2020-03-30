package innerclass;

class Outer{
	
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) {
		
		int num = 10;
		class MyRunnable implements Runnable{

			@Override
			public void run() {
				//num += 10; ���� ������ final�� ���ȭ�ż� ���� �Ұ�
				System.out.println(outNum);
				System.out.println(Outer.sNum);
				System.out.println(sNum);
			}
			
		}
		return new MyRunnable();
	}
}

public class LocalInnerClassTest {

	public static void main(String[] args) {
		Outer out = new Outer();
		Runnable run = out.getRunnable(50);
		run.run();
	}

}
