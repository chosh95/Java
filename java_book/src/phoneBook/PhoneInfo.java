package phoneBook;

public class PhoneInfo {

	public String name;
	public String phoneNumber;
	
	public PhoneInfo(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	public void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phoneNumber);
	}
}
