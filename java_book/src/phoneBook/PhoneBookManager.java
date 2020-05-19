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
		System.out.println("�̸� : ");
		String name = sc.nextLine();
		System.out.println("��ȭ��ȣ : ");
		String phoneNumber = sc.nextLine();
		return new PhoneInfo(name,phoneNumber);
	}
	
	public PhoneUnivInfo inputUnivFriendInfo() {
		System.out.println("�̸� : ");
		String name = sc.nextLine();
		System.out.println("��ȭ��ȣ : ");
		String phoneNumber = sc.nextLine();
		System.out.println("�а� : ");
		String major = sc.nextLine();
		System.out.println("�г� : ");
		int year = sc.nextInt();
		sc.nextLine();
		return new PhoneUnivInfo(name,phoneNumber,major,year);
	}
	
	public PhoneCompanyInfo inputCompanyFriendInfo() {
		System.out.println("�̸� : ");
		String name = sc.nextLine();
		System.out.println("��ȭ��ȣ : ");
		String phoneNumber = sc.nextLine();
		System.out.println("ȸ�� : ");
		String company = sc.nextLine();
		return new PhoneCompanyInfo(name,phoneNumber,company);
	}
	
	public void PhoneDataInput() {
		System.out.println("������ �Է��� �����մϴ�.\n1. �Ϲ�, 2. ����, 3. ȸ�� ");
		System.out.println("����>>");
		int opt = sc.nextInt();
		sc.nextLine();
		PhoneInfo info = null;
		if(opt==INPUT_SELECT.NORMAL) 
			info = inputFriendInfo();
		else if(opt==INPUT_SELECT.UNIV) 
			info = inputUnivFriendInfo();
		else if(opt==INPUT_SELECT.COMPANY)
			info = inputCompanyFriendInfo();
		
		phoneBook[idx++] = info;
		System.out.println("������ �Է��� �Ϸ�Ǿ����ϴ�.");
	}
	
	public void PhoneDataSearch() {
		System.out.println("������ �˻��� �����մϴ�.\n�̸� : ");
		String name = sc.nextLine();
		int index = FindData(name);
		if(index!=-1) {
			phoneBook[index].showInfo();
			System.out.println("������ �˻��� �Ϸ�Ǿ����ϴ�.");
		}
		else 
			System.out.println("���� ������ �Դϴ�.");
	}
	
	public void PhoneDataDelete() {
		System.out.println("������ ������ �����մϴ�.\n�̸� : ");
		String name = sc.nextLine();
		int index = FindData(name);
		if(index!=-1) {
			for(int i=index;i<idx;i++) 
				phoneBook[i] = phoneBook[i+1];
			
			idx--;
			System.out.println("������ ������ �Ϸ�Ǿ����ϴ�.");
		}
		else 
			System.out.println("���� ������ �Դϴ�.");
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
