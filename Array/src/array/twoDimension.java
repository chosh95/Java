package array;

public class twoDimension {

	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
