package scheduler;

public class LeastJob implements Scheduler{

	@Override
	public void getNectCall() {
		System.out.println("�۾��� ���� ���� ����� �޽��ϴ�.");
	}

	@Override
	public void sendCall() {
		System.out.println("������ ��������");		
	}

}
