package stream;

import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		int sum = Arrays.stream(arr).sum();
		int cnt = (int)Arrays.stream(arr).count();
		
		System.out.println(sum + " " + cnt);
	}

}
