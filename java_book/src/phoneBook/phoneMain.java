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
			if(opt==INIT_MENU.INPUT) {
				manager.PhoneDataInput();
			}
			else if(opt==INIT_MENU.SEARCH) {
				manager.PhoneDataSearch();
			}
			else if(opt==INIT_MENU.DELETE) {
				manager.PhoneDataDelete();
			}
			else if(opt==INIT_MENU.EXIT) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
		}
		
	}
}
