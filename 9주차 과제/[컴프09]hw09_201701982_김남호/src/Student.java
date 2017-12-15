	
class Student {
	String name;
	String depart;
	int number, grade, credit;
	
	public Student() {}
	
	public Student(String n, int num, String d, int g, int c) {
		name = n;
		number = num;
		depart = d;
		grade = g;
		credit = c;
	}
}

class Undergraduate extends Student{
	private String club;
	public void setClub(String c) {		club = c;		}
	public String getClub() {		return club;		}
}

class Graduate extends Student{
	String assistant;
	double money;
	
	public void setAssistant(String a) {		assistant = a;		}
	public String getAssistant() {		return assistant;		}
	public void setMoney(double m) {		money = m;		}
	public double getMoney() {		return money;		}
}