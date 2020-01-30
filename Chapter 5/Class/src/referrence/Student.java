package referrence;

public class Student {
	public int stuId;
	public String stuName;
	
	Subject koreaSubject;
	
	public Student(String name, int id) {
		stuName = name;
		stuId = id;
		
		koreaSubject = new Subject(100, "국어");
	}
	public void showStudentScore() {
		System.out.println("학생의 총점은 " + koreaSubject.score);
	}
}
