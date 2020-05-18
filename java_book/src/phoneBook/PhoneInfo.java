package phoneBook;

public class PhoneInfo {

	public String name;
	public String phoneNumber;
	public String birthday;
	
	public PhoneInfo(String name, String phoneNumber, String birthday) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birthday = birthday;
	}
	
	public PhoneInfo(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	public void showInfo() {
		System.out.println("�̸� : " + name);
		System.out.println("��ȭ��ȣ : " + phoneNumber);
		if(birthday != null)
			System.out.println("������� : " + birthday);
		System.out.println("------------------------------");
	}
}
