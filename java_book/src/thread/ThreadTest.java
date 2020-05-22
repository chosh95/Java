package thread;

import java.util.Scanner;

class Number{
	int num = 0;
	boolean isChanged = false;
	
	public void setNum(int n) {
		synchronized (this) {
			if(isChanged==true) {
				try {
					wait();
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			num = n;
			isChanged = true;
			notify();
		}
	}
	
	public int getNum() {
		int res = 0;
		synchronized (this) {
			if(isChanged ==false) {
				try {
					wait();
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
				res = num;
				isChanged = false;
				notify();
			}
		}
		return res;
	}
}

class addNum extends Thread{
	Number num1 = new Number();
	int sum = 0;
	
	public addNum(Number num) {
		num1 = num;
	}
	
	public void run() {
		for(int i=0;i<5;i++)
			sum += num1.getNum();
		
		System.out.println(sum+ " ");
	}
}
	


public class ThreadTest {

	public static void main(String[] args) {
		Number num = new Number();
		addNum sum = new addNum(num);
		sum.start();
		
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			num.setNum(sc.nextInt());
		}
		
		try {
			sum.join();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		sc.close();
	}
}
