package thread;

public class InterruptTest extends Thread{

	public void run() {
		for(int i=0;i<200;i++) {
			System.out.println(i);
			
		}
		try {
			sleep(5000);
		} catch (InterruptedException e) {
			System.out.println(e);
			System.out.println("Wake up");
		}
	}
	public static void main(String[] args) {

		InterruptTest test = new InterruptTest();
		test.start();
		test.interrupt();
		System.out.println("end");
	}

}
