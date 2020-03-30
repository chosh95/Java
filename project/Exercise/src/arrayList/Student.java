package arrayList;

import java.util.ArrayList;

public class Student {
	String name;
	ArrayList<Book> booklist;
	
	Student(String name){
		this.name = name;
		booklist = new ArrayList<Book>();
	}
	public void addBook(String name) {
		Book tmp = new Book(name);
		booklist.add(tmp);
	}
	public void showInfo() {
		for(Book book : booklist) {
			System.out.println(book.getBook());
		}
	}
}
