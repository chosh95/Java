package inheritance;

public class GoldCustomer extends Customer{
	double salesRatio;
	
	public GoldCustomer(int id, String name) {
		super(id,name);
		salesRatio = 0.05;
		customerGrade = "GOLD";
		this.bonusRatio = 0.02;
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(bonusRatio*price);
		
	}
}
