package arrayList;

public class StudentTest {

	public static void main(String args[]) {
		Student kim = new Student("kim");
		kim.addBook("�¹���1");
		kim.addBook("�¹���2");
		Student lee = new Student("Lee");
		lee.addBook("����1");
		lee.addBook("����2");
		kim.showInfo();
		System.out.println("===============");
		lee.showInfo();
		
	}
}
