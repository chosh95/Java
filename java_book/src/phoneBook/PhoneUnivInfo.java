package phoneBook;

public class PhoneUnivInfo extends PhoneInfo{

	private String major;
	private int year;
	
	public PhoneUnivInfo(String name, String phoneNumber, String major, int year) {
		super(name, phoneNumber);
		this.major = major;
		this.year = year;
	}
	
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("�а� : " + this.major);
		System.out.println("�г� : " + this.year);
	}

}
