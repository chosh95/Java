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
		System.out.println("������ �Է��� �����մϴ�.\n�̸� : ");
		String name = sc.nextLine();
		System.out.println("��ȭ��ȣ : ");
		String phoneNumber = sc.nextLine();
		System.out.println("������� : ");
		String birthday = sc.nextLine();
		
		phoneBook[idx++] = new PhoneInfo(name,phoneNumber,birthday);
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
