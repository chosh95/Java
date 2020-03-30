package scheduler;

public class RoundRobin implements Scheduler{

	@Override
	public void getNectCall() {
		System.out.println("순서대로 전화를 받습니다.");
	}

	@Override
	public void sendCall() {
		System.out.println("다음분 받으세여");
	}
	

}
