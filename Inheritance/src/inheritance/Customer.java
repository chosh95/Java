package inheritance;

public class Customer {
	
	protected int customerId;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	public Customer(int customerId, String customerName) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerGrade = "SILVER";
		this.bonusRatio = 0.01;
	}
	public int calcPrice(int price) {
		bonusPoint += price*bonusRatio;
		return price;
	}
	public String showInfo() {
		return customerName + "님의 등급은 " + customerGrade + "이며, 적립 보너스는 " + bonusPoint;
	}
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCumtomerName(String cumtomerName) {
		customerName = cumtomerName;
	}
	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String customerGrade) {
		customerGrade = customerGrade;
	}
}
