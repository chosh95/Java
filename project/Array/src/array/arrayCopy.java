package array;

public class arrayCopy {

	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {10,20,30,40,50};
		System.arraycopy(arr1, 2, arr2, 2, 2);
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i] + " ");
		}
	}

}
