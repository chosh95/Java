package inheritance;

public class VIPCustomer extends Customer{
	double salesRatio;
	private String agentId;
	
	public VIPCustomer() {
		customerGrade = "VIP";
		salesRatio = 0.1;
		bonusRatio = 0.05;
	}
	
	public VIPCustomer(int id, String name, String agentId) {
		super(id,name);
		this.agentId = agentId;
		customerGrade = "VIP";
		salesRatio = 0.1;
		bonusRatio = 0.05;
		
	}
	
	@Override
	public int calcPrice(int price) {
		//return super.calcPrice(price);
		bonusPoint += price * bonusRatio;
		return price - (int)(bonusRatio*price);
		
	}
	
	@Override
	public String showInfo() {
		return super.showInfo() + " " + this.agentId;
	}
}
