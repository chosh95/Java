package phoneBook;

import java.util.Scanner;

public class phoneMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("�����ϼ��� \n1.������ �Է�\n2. ���α׷� ����");
			System.out.print("���� : ");
			int tmp = sc.nextInt();
			sc.nextLine();
			if(tmp==1) {
				String name, phoneNumber, birthday;
				
				System.out.print("�̸� : ");
				name = sc.nextLine();
				
				System.out.print("��ȭ��ȣ : ");
				phoneNumber = sc.nextLine();
				
				System.out.print("������� : ");
				birthday = sc.nextLine();
				
				PhoneInfo inst = new PhoneInfo(name,phoneNumber,birthday);
				inst.showInfo();
			}
			else {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
		}
		
		sc.close();
	}
}
