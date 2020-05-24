package phoneBook;

public class MenuChoiceException extends Exception{
	
	private int menu;
	
	public MenuChoiceException(int menu) {
		super("잘못된 선택이 이뤄졌습니다.");
		this.menu = menu;
	}
	
	public void showException() {
		System.out.println(menu + "에 해당하는 선택은 존재하지 않습니다.");
	}
	
}
