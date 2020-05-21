package phoneBook;

public class PhoneInfo {

	public String name;
	public String phoneNumber;
	
	public PhoneInfo(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	public void showInfo() {
		System.out.println("�̸� : " + name);
		System.out.println("��ȭ��ȣ : " + phoneNumber);
	}
	
	public int hashCode() {
		return name.hashCode();
	}
	
	public boolean equals(Object obj) {
		PhoneInfo inst = (PhoneInfo)obj;
		if(name.compareTo(inst.name)==0) {
			return true;
		}
		return false;
	}
}
