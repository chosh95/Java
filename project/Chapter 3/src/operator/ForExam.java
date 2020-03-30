package operator;

import java.util.Scanner;

public class ForExam {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String gender = scanner.nextLine();
		if(gender=="F")
			System.out.println(true);
		else
			System.out.println(false);
	}
}
