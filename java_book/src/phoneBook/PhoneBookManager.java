package phoneBook;

import java.util.Scanner;

public class PhoneBookManager {
	
	static Scanner sc = new Scanner(System.in);
	private int idx = 0;
	private PhoneInfo[] phoneBook;
	
	public PhoneBookManager(){
		phoneBook = new PhoneInfo[100];
	}
	
	public void PhoneDataInput() {
		System.out.println("데이터 입력을 시작합니다.\n이름 : ");
		String name = sc.nextLine();
		System.out.println("전화번호 : ");
		String phoneNumber = sc.nextLine();
		System.out.println("생년월일 : ");
		String birthday = sc.nextLine();
		
		phoneBook[idx++] = new PhoneInfo(name,phoneNumber,birthday);
		System.out.println("데이터 입력이 완료되었습니다.");
	}
	
	public void PhoneDataSearch() {
		System.out.println("데이터 검색을 시작합니다.\n이름 : ");
		String name = sc.nextLine();
		int index = FindData(name);
		if(index!=-1) {
			phoneBook[index].showInfo();
			System.out.println("데이터 검색이 완료되었습니다.");
		}
		else 
			System.out.println("없는 데이터 입니다.");
	}
	
	public void PhoneDataDelete() {
		System.out.println("데이터 삭제를 시작합니다.\n이름 : ");
		String name = sc.nextLine();
		int index = FindData(name);
		if(index!=-1) {
			for(int i=index;i<idx;i++) 
				phoneBook[i] = phoneBook[i+1];
			
			idx--;
			System.out.println("데이터 삭제가 완료되었습니다.");
		}
		else 
			System.out.println("없는 데이터 입니다.");
	}
	
	public int FindData(String name) {
		for(int i = 0; i<idx;i++) {
			if(phoneBook[i].name.equals(name)) {
				return i;
			}
		}
		return -1;
	}
}
