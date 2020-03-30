package object;

class Date{
	public int day;
	public int month;
	public int year;
	
	public Date(int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}

	@Override
	public boolean equals(Object obj) {
		Date tmp = (Date)obj;
		if(this.day == tmp.day && this.month == tmp.month)
			return true;
		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return day+(100*month) + (10000*year);
	}
	
}

public class DateTest {

	public static void main(String[] args) {
		Date date = new Date(3,2,2020);
		Date date2 = new Date(3,2,2020);
		System.out.println(date==date2);
		System.out.println(date.equals(date2));
		System.out.println(date.hashCode());
		System.out.println(date2.hashCode());
	}
	
}
