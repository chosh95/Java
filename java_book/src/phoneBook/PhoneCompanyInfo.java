package phoneBook;

public class PhoneCompanyInfo extends PhoneInfo{

	private String company;
	
	public PhoneCompanyInfo(String name, String phoneNumber, String company) {
		super(name, phoneNumber);
		this.company = company;
	}

	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("È¸»ç : " + this.company);
	}
}
