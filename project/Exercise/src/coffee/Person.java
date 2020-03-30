package coffee;

public class Person {
	private String name;
	private int money;
	
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void takeStarCoffee(StarCoffee star,int money) {
		star.takeCoffee(money);
		this.money -= money;
		star.showInfo();
		System.out.println(this.name + "님은 현재 " + this.money + "원 있습니다.");
	}
}
