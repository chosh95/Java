package stream;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {

		ArrayList<Customer> list = new ArrayList<Customer>();
		list.add(new Customer("이순신", 40, 100));
		list.add(new Customer("김유신", 20, 100));
		list.add(new Customer("홍길동", 13, 50));
		
		System.out.println(list); //toString()으로 출력
		
		list.stream().forEach(c ->{System.out.println(c.getName());});
		int suma = list.stream().mapToInt(c->c.getCost()).sum();
		System.out.println(suma);
		
		list.stream().filter(c->c.getAge()>=20).map(c->c.getName()).sorted().forEach(s->System.out.println(s));
	}

}
