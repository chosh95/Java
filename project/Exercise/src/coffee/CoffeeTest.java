package coffee;

public class CoffeeTest {
	
	public static void main(String[] args) {
		Person kim = new Person("kim", 100000);
		StarCoffee star = new StarCoffee(0);
		kim.takeStarCoffee(star, 4500);
	}
}
