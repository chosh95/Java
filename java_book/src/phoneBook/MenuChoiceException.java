package phoneBook;

public class MenuChoiceException extends Exception{
	
	private int menu;
	
	public MenuChoiceException(int menu) {
		super("�߸��� ������ �̷������ϴ�.");
		this.menu = menu;
	}
	
	public void showException() {
		System.out.println(menu + "�� �ش��ϴ� ������ �������� �ʽ��ϴ�.");
	}
	
}
