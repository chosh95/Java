package scheduler;

public class RoundRobin implements Scheduler{

	@Override
	public void getNectCall() {
		System.out.println("������� ��ȭ�� �޽��ϴ�.");
	}

	@Override
	public void sendCall() {
		System.out.println("������ ��������");
	}
	

}
