package car;

public abstract class Car {
	
	Car car;
	public abstract void start();
	public abstract void drive();
	public abstract void stop();
	final public void run() {
		start();
		drive();
		stop();
	}
	
}
