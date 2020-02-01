package inheritance;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		ArrayList<Customer> list = new ArrayList<Customer>();
		Customer lee = new Customer(10010, "이순신");
		Customer shin = new Customer(10020, "신사임당");
		Customer hong = new GoldCustomer(10030, "홍길동");
		Customer yul = new GoldCustomer(10040, "이율곡");
		Customer kim = new VIPCustomer(10050, "김유신", "12345");
		
		list.add(lee);
		list.add(shin);
		list.add(hong);
		list.add(yul);
		list.add(kim);
		
		for(Customer c : list) {
			System.out.println(c.showInfo());
		}
		
		int price = 10000;
		for(Customer c : list) {
			int cost = c.calcPrice(price);
			System.out.println(cost + "  " + c.bonusPoint);
		}
	}

}
