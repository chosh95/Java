package sort;

public class HeapSort implements Sort{

	@Override
	public void ascending(int[] arr) {
		System.out.println("HeadSort Ascending");
	}

	@Override
	public void descending(int[] arr) {
		System.out.println("HeadSort descending");		
	}
	
	@Override
	public void show() {
		Sort.super.show();
		System.out.println("HeapSort 정렬 방식");
	}
	
}
