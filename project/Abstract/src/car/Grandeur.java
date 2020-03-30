package car;

public class Grandeur extends Car{

	@Override
	public void start() {
		System.out.println("Grandeur ½Ãµ¿À» ÄÕ´Ï´Ù.");
	}

	@Override
	public void drive() {
		System.out.println("Grandeur ´Ş¸³´Ï´Ù.");
	}

	@Override
	public void stop() {
		System.out.println("Grandeur ¸ØÃä´Ï´Ù.");		
	}

}
