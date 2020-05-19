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
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		
	}
}
