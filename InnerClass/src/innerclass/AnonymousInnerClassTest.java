package innerclass;
class Outer2{
	
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) {
		
		int num = 10;
		//�͸� ���� Ŭ����
		return new Runnable(){

			@Override
			public void run() {
				//num += 10; ���� ������ final�� ���ȭ�ż� ���� �Ұ�
				System.out.println(outNum);
				System.out.println(Outer2.sNum);
				System.out.println(sNum);
			}
			
		};
	}
	
	Runnable runner = new Runnable() {
		
		@Override
		public void run() {
			System.out.println("Anonymous");
		}
	};
}
public class AnonymousInnerClassTest {

	public static void main(String[] args) {
		Outer2 out = new Outer2();
		out.runner.run();
		Runnable run = out.getRunnable(10);
		run.run();
		
		
	}

}
