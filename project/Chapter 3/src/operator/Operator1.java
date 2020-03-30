package operator;

public class Operator1 {

	public static void main(String[] args) {
		int num1 = 0B00001010; //10
		int num2 = 0B00000101;
		int num3 = num1 & num2;
		int num4 = num1 | num2;
		System.out.print(num1 +" "+num2 + "\n");
		num1 <<= 2;
		System.out.println(num1);
	}

}
