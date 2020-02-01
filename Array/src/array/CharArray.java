package array;

public class CharArray {

	public static void main(String args[]) {
		char tmp[] = new char[26];
		int a = (int)'A';
		for(int i=0;i<26;i++) {
			tmp[i] = (char)(a+i);
		}
		for(int i=0;i<26;i++) {
			System.out.println(tmp[i]);
		}
	}
}
