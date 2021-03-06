package thread;

import java.io.IOException;

public class TerminateThread extends Thread{

	private boolean flag = false;
	int i;
	
	public TerminateThread(String name) {
		super(name);
	}
	
	public void run() {
		while(!flag) {
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(getName() + " end");
	}
	
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	public static void main(String[] args) throws IOException {
		TerminateThread tA = new TerminateThread("A");
		TerminateThread tB = new TerminateThread("B");
		
		tA.start();
		tB.start();
		
		int in;
		while(true) {
			in = System.in.read();
			if(in=='A')
				tA.setFlag(true);
			else if(in=='B')
				tB.setFlag(true);
			else if(in=='M') {
				tA.setFlag(true);
				tB.setFlag(true);
				break;
			}
			else
				System.out.println("try again");
		}
		System.out.println("main end");
	}

}
