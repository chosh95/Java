package date;

public class MydateTest {

	public static void main(String[] args) {
		Mydate date = new Mydate(30,2,2019);
		if(date.isValid())
			System.out.println("유효한 날짜입니다.");
		else
			System.out.println("유효한 날짜가 아닙니다.");
	}

}
