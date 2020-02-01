package arrayList;

public class StudentTest {

	public static void main(String args[]) {
		Student kim = new Student("kim");
		kim.addBook("태백산맥1");
		kim.addBook("태백산맥2");
		Student lee = new Student("Lee");
		lee.addBook("토지1");
		lee.addBook("토지2");
		kim.showInfo();
		System.out.println("===============");
		lee.showInfo();
		
	}
}
