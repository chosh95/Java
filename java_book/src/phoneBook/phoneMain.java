package phoneBook;

import java.util.Scanner;

public class phoneMain {
	static Scanner sc = new Scanner(System.in);
	
	public static int inputData() {
		System.out.println("선택하세요\n1. 데이터 입력\n2. 데이터 검색\n3.데이터 삭제\n4. 프로그램 종료\n선택 : ");
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
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		
	}
}
