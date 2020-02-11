package coffee;

public class CoffeeTest {

	public static void main(String[] args) {
		Coffee americano = new KenyaAmericano();
		americano.brewing();
		
		Coffee kenya = new Latte(new KenyaAmericano());
		kenya.brewing();
	}

}
