package date;

public class Mydate {

	private int day;
	private int month;
	private int year;
	
	public Mydate(int day,int month,int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public boolean isValid() {
		if(this.month < 1 || this.month > 12) return false;
		switch(this.month) {
			case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 :
				if(this.day<1 || this.day>31) return false;
				else return true;
			case 4 : case 6 : case 9 : case 11 :
				if(this.day<1 || this.day >30) return false;
				else return true;
			case 2 :
				if(this.day<1 || this.day>29) return false;
				else if(this.year%100 == 0 && day>28) return false;
				else return true;
		}
		return false;
	}
}
