package phoneBook;

import java.util.Scanner;

public class phoneMain {
	static Scanner sc = new Scanner(System.in);
	
	public static int inputData() {
		System.out.println("�����ϼ���\n1. ������ �Է�\n2. ������ �˻�\n3.������ ����\n4. ���α׷� ����\n���� : ");
		int res = sc.nextInt();
		sc.nextLine();
		return res;
	}
	
	public static void main(String[] args) {
		
		PhoneBookManager manager = new PhoneBookManager();
		
		while(true) {
			int opt = inputData();
			if(opt==1) {
				manager.PhoneDataInput();
			}
			else if(opt==2) {
				manager.PhoneDataSearch();
			}
			else if(opt==3) {
				manager.PhoneDataDelete();
			}
			else if(opt==4) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
		}
		
	}
}
