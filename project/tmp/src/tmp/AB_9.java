package tmp;

import java.math.BigInteger;
import java.util.Scanner;

public class AB_9 {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		BigInteger A, B, res;
		A = scanner.nextBigInteger();
		B = scanner.nextBigInteger();
		res = A.add(B);
		System.out.println(res);
	}
}
