package referrence;

public class Student {
	public int stuId;
	public String stuName;
	
	Subject koreaSubject;
	
	public Student(String name, int id) {
		stuName = name;
		stuId = id;
		
		koreaSubject = new Subject(100, "����");
	}
	public void showStudentScore() {
		System.out.println("�л��� ������ " + koreaSubject.score);
	}
}
