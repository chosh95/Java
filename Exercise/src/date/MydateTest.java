package date;

public class MydateTest {

	public static void main(String[] args) {
		Mydate date = new Mydate(30,2,2019);
		if(date.isValid())
			System.out.println("��ȿ�� ��¥�Դϴ�.");
		else
			System.out.println("��ȿ�� ��¥�� �ƴմϴ�.");
	}

}
