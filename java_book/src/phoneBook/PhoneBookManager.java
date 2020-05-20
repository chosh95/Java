package phoneBook;

import java.util.Scanner;

public class PhoneBookManager {
	
	static Scanner sc = new Scanner(System.in);
	private int idx = 0;
	private PhoneInfo[] phoneBook;
	
	static PhoneBookManager inst =  null;
	public static PhoneBookManager createManagerInst() {
		if(inst == null)
			inst = new PhoneBookManager();
		return inst;
	}
	
	public PhoneBookManager(){
		phoneBook = new PhoneInfo[100];
	}
	
	public PhoneInfo inputFriendInfo() {
		System.out.println("이름 : ");
		String name = sc.nextLine();
		System.out.println("전화번호 : ");
		String phoneNumber = sc.nextLine();
		return new PhoneInfo(name,phoneNumber);
	}
	
	public PhoneUnivInfo inputUnivFriendInfo() {
		System.out.println("이름 : ");
		String name = sc.nextLine();
		System.out.println("전화번호 : ");
		String phoneNumber = sc.nextLine();
		System.out.println("학과 : ");
		String major = sc.nextLine();
		System.out.println("학년 : ");
		int year = sc.nextInt();
		sc.nextLine();
		return new PhoneUnivInfo(name,phoneNumber,major,year);
	}
	
	public PhoneCompanyInfo inputCompanyFriendInfo() {
		System.out.println("이름 : ");
		String name = sc.nextLine();
		System.out.println("전화번호 : ");
		String phoneNumber = sc.nextLine();
		System.out.println("회사 : ");
		String company = sc.nextLine();
		return new PhoneCompanyInfo(name,phoneNumber,company);
	}
	
	public void PhoneDataInput() throws MenuChoiceException {
		System.out.println("데이터 입력을 시작합니다.\n1. 일반, 2. 대학, 3. 회사 ");
		System.out.println("선택>>");
		int opt = sc.nextInt();
		sc.nextLine();
		PhoneInfo info = null;
		
		if(opt<INPUT_SELECT.NORMAL || opt>INPUT_SELECT.COMPANY)
			throw new MenuChoiceException(opt);
		
		if(opt==INPUT_SELECT.NORMAL) 
			info = inputFriendInfo();
		else if(opt==INPUT_SELECT.UNIV) 
			info = inputUnivFriendInfo();
		else if(opt==INPUT_SELECT.COMPANY)
			info = inputCompanyFriendInfo();
		
		phoneBook[idx++] = info;
		System.out.println("데이터 입력이 완료되었습니다.\n");
	}
	
	public void PhoneDataSearch() {
		System.out.println("데이터 검색을 시작합니다.\n이름 : ");
		String name = sc.nextLine();
		int index = FindData(name);
		if(index!=-1) {
			phoneBook[index].showInfo();
			System.out.println("데이터 검색이 완료되었습니다.\n");
		}
		else 
			System.out.println("없는 데이터 입니다.\n");
	}
	
	public void PhoneDataDelete() {
		System.out.println("데이터 삭제를 시작합니다.\n이름 : ");
		String name = sc.nextLine();
		int index = FindData(name);
		if(index!=-1) {
			for(int i=index;i<idx;i++) 
				phoneBook[i] = phoneBook[i+1];
			
			idx--;
			System.out.println("데이터 삭제가 완료되었습니다.\n");
		}
		else 
			System.out.println("없는 데이터 입니다.\n");
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
