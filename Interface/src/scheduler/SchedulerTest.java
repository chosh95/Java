package scheduler;

public class SchedulerTest {

	public static void main(String[] args) {
		Scheduler scheduler = null;
		char ch = 'R';
		if(ch=='R')
			scheduler = new RoundRobin();
		if(ch=='L')
			scheduler = new LeastJob();
		
		scheduler.sendCall();
		scheduler.getNectCall();
	}

}
