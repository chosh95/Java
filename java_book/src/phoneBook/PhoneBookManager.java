package phoneBook;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class PhoneBookManager {
	
	static Scanner sc = new Scanner(System.in);
	private HashSet<PhoneInfo> phoneBook = new HashSet<PhoneInfo>();
	
	static PhoneBookManager inst =  null;
	public static PhoneBookManager createManagerInst() {
		if(inst == null)
			inst = new PhoneBookManager();
		return inst;
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
	
	public void PhoneDataInput() throws MenuChoiceException {
		System.out.println("������ �Է��� �����մϴ�.\n1. �Ϲ�, 2. ����, 3. ȸ�� ");
		System.out.println("����>>");
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
		
		boolean isPossible = phoneBook.add(info);
		if(isPossible==true)
			System.out.println("������ �Է��� �Ϸ�Ǿ����ϴ�.\n");
		else
			System.out.println("�̹� ����� �������Դϴ�. \n");
	}
	
	public void PhoneDataSearch() {
		System.out.println("������ �˻��� �����մϴ�.\n�̸� : ");
		String name = sc.nextLine();
		PhoneInfo info = FindData(name);
		if(info!=null) {
			info.showInfo();
			System.out.println("������ �˻��� �Ϸ�Ǿ����ϴ�.\n");
		}
		else 
			System.out.println("���� ������ �Դϴ�.\n");
	}
	
	public void PhoneDataDelete() {
		System.out.println("������ ������ �����մϴ�.\n�̸� : ");
		String name = sc.nextLine();
		PhoneInfo info = FindData(name);
		if(info==null)
			System.out.println("���� ������ �Դϴ�.\n");
		else {
			Iterator<PhoneInfo> iter = phoneBook.iterator();
			while(iter.hasNext()) {
				PhoneInfo tmp = iter.next();
				if(name.compareTo(tmp.name)==0) {
					iter.remove();
					System.out.println("������ ������ �Ϸ�Ǿ����ϴ�.\n");
					break;
				}
			}
		}
	}
	
	public PhoneInfo FindData(String name) {
		Iterator<PhoneInfo> iter = phoneBook.iterator();
		while(iter.hasNext()) {
			PhoneInfo tmp = iter.next();
			if(name.compareTo(tmp.name)==0)
				return tmp;
		}
		return null;
	}
}
