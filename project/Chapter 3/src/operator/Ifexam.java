package operator;

public class Ifexam {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int i=2;i<10;i+=2) 
			for(int j=1;j<=i;j++) 
				System.out.println(i+" x " + j + " = " + i*j);
	}
}
