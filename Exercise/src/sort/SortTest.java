package sort;

import java.io.IOException;

public class SortTest {

	public static void main(String[] args) throws IOException {
		char ch;
		ch = (char) System.in.read();
		Sort sort = null;
		if(ch=='H')
			sort = new HeapSort();
		int[] arr = {1,2,3};
		sort.ascending(arr);
		sort.descending(arr);
		sort.show();
	}

}
