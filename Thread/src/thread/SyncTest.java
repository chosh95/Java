package thread;

class Bank{
	private int money = 10000;
	public void saveMoney(int save) {
		int m = this.getMoney();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		setMoney(m + save);
	}
	
	public void minusMoney(int minus) {
		int m = this.getMoney();
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		setMoney(m - minus);
	}
	
	void setMoney(int money) {
		this.money = money;
	}
	
	int getMoney() {
		return this.money;
	}
}

class Park extends Thread{
	public void run() {
		synchronized (SyncTest.myBank) {
			System.out.println("start save money");
			SyncTest.myBank.saveMoney(3000);
			System.out.println("save money :" + SyncTest.myBank.getMoney());
			
		}
	}
}

class ParkWife extends Thread{
	public void run() {
		synchronized (SyncTest.myBank) {
			System.out.println("start spend money");
			SyncTest.myBank.minusMoney(2000);
			System.out.println("spend money :" + SyncTest.myBank.getMoney());
		}
	}
}

public class SyncTest {

	public static Bank myBank = new Bank();
	
	public static void main(String[] args) throws InterruptedException {
		
		Park p = new Park();
		p.start();
		
		Thread.sleep(200);
		ParkWife pw = new ParkWife();
		pw.start();
		
	}
}
