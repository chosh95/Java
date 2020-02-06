package stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class ArrayListStreamTest {

	public static void main(String[] args) {

		ArrayList<String> str = new ArrayList<String>();
		str.add("asd");
		str.add("dbfba");
		str.add("cdcdcd");
		
		//Collection 구조는 Stream으로 생성. 배열은 Arrays.~~~
		Stream<String> strm = str.stream();
		strm.forEach(s->System.out.print(s + " "));
		System.out.println();
		
		str.stream().forEach(s->System.out.println(s));
		
		str.stream().sorted().forEach(s->System.out.print(s + " " ));
		System.out.println();
		
		//각각의 길이 출력 
		str.stream().map(s->s.length()).forEach(v->System.out.println(v));
	}

}
