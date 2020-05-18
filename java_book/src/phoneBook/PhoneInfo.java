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
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phoneNumber);
		if(birthday != null)
			System.out.println("생년월일 : " + birthday);
		System.out.println("------------------------------");
	}
}
