package coffee;

public class StarCoffee {

	private int money;
	
	public StarCoffee() {}
	public StarCoffee(int money) {
		this.money = money;
	}
	public void takeCoffee(int money) {
		this.money += money;
	}
	public void showInfo() {
		System.out.println("star Coffee는  " + this.money + "원 있습니다.");
	}
}
