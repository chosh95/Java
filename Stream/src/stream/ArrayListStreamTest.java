package stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class ArrayListStreamTest {

	public static void main(String[] args) {

		ArrayList<String> str = new ArrayList<String>();
		str.add("asd");
		str.add("dbfba");
		str.add("cdcdcd");
		
		//Collection ������ Stream���� ����. �迭�� Arrays.~~~
		Stream<String> strm = str.stream();
		strm.forEach(s->System.out.print(s + " "));
		System.out.println();
		
		str.stream().forEach(s->System.out.println(s));
		
		str.stream().sorted().forEach(s->System.out.print(s + " " ));
		System.out.println();
		
		//������ ���� ��� 
		str.stream().map(s->s.length()).forEach(v->System.out.println(v));
	}

}
