
public class StudentTest {
	public static void main(String[] args) {
		Student s = new Student("김남호",201701982,"컴공",1,17);
		Undergraduate u = new Undergraduate();
		u.setClub("ARGOS");
		System.out.println("이름:"+s.name+" 학번:"+s.number+" 소속 학과:"+s.depart+" 학년:"+s.grade+" 이수 학점:"+s.credit);
		
		Student t = new Student("호남김",200901982,"컴공",4,10);
		Graduate g = new Graduate();
		g.setAssistant("교육 조교");
		g.setMoney(0.7);
		System.out.println("이름:"+t.name+" 학번:"+t.number+" 소속 학과:"+t.depart+" 학년:"+t.grade+" 이수 학점:"+t.credit+" 조교 유형: "+g.getAssistant()+" 장학금 비율:"+g.getMoney());
	}
}
