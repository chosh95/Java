package sort;

public interface Sort {
	public void ascending(int[] arr);
	public void descending(int[] arr);
	default public void show() {
		System.out.println("정렬 방식입니다.");
	}
}
