package phoneBook;

import java.util.Scanner;

public class phoneMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("선택하세요 \n1.데이터 입력\n2. 프로그램 종료");
			System.out.print("선택 : ");
			int tmp = sc.nextInt();
			sc.nextLine();
			if(tmp==1) {
				String name, phoneNumber, birthday;
				
				System.out.print("이름 : ");
				name = sc.nextLine();
				
				System.out.print("전화번호 : ");
				phoneNumber = sc.nextLine();
				
				System.out.print("생년월일 : ");
				birthday = sc.nextLine();
				
				PhoneInfo inst = new PhoneInfo(name,phoneNumber,birthday);
				inst.showInfo();
			}
			else {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		
		sc.close();
	}
}
