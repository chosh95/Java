package scheduler;

public class LeastJob implements Scheduler{

	@Override
	public void getNectCall() {
		System.out.println("작업이 제일 적은 사람이 받습니다.");
	}

	@Override
	public void sendCall() {
		System.out.println("다음분 받으세여");		
	}

}
