package phoneBook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class PhoneBookManager {
	
	private final File dataFile = new File("PhoneBook.dat");
	Scanner sc = new Scanner(System.in);
	private HashSet<PhoneInfo> phoneBook = new HashSet<PhoneInfo>();
	
	static PhoneBookManager inst =  null;
	public static PhoneBookManager createManagerInst() {
		if(inst == null)
			inst = new PhoneBookManager();
		return inst;
	}
	
	private PhoneBookManager() {
		readFromFile();
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
		
		boolean isPossible = phoneBook.add(info);
		if(isPossible==true)
			System.out.println("데이터 입력이 완료되었습니다.\n");
		else
			System.out.println("이미 저장된 데이터입니다. \n");
	}
	
	public void PhoneDataSearch() {
		System.out.println("데이터 검색을 시작합니다.\n이름 : ");
		String name = sc.nextLine();
		PhoneInfo info = FindData(name);
		if(info!=null) {
			info.showInfo();
			System.out.println("데이터 검색이 완료되었습니다.\n");
		}
		else 
			System.out.println("없는 데이터 입니다.\n");
	}
	
	public void PhoneDataDelete() {
		System.out.println("데이터 삭제를 시작합니다.\n이름 : ");
		String name = sc.nextLine();
		PhoneInfo info = FindData(name);
		if(info==null)
			System.out.println("없는 데이터 입니다.\n");
		else {
			Iterator<PhoneInfo> iter = phoneBook.iterator();
			while(iter.hasNext()) {
				PhoneInfo tmp = iter.next();
				if(name.compareTo(tmp.name)==0) {
					iter.remove();
					System.out.println("데이터 삭제가 완료되었습니다.\n");
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
	
	public void storeToFile() {
		try {
			FileOutputStream file = new FileOutputStream(dataFile);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			Iterator<PhoneInfo> iter = phoneBook.iterator();
			while(iter.hasNext()) 
				out.writeObject(iter.next());
				
			out.close();
			
		}	
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void readFromFile() {
		if(dataFile.exists()==false) return;
		try {
			FileInputStream file = new FileInputStream(dataFile);
			ObjectInputStream in = new ObjectInputStream(file);
			
			while(true) {
				PhoneInfo info = (PhoneInfo)in.readObject();
				if(info==null) break;
				phoneBook.add(info);
			}
			in.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
