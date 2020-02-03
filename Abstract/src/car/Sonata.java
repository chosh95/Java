package car;

public class Sonata extends Car{

	@Override
	public void start() {
		System.out.println("Avante ½Ãµ¿À» ÄÕ´Ï´Ù.");		
	}

	@Override
	public void drive() {
		System.out.println("Avante ´Ş¸³´Ï´Ù.");		
	}

	@Override
	public void stop() {
		System.out.println("Avante ¸ØÃä´Ï´Ù.");		
	}

}
