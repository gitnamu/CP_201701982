
public class StudentTest {
	public static void main(String[] args) {
		Student s = new Student("�賲ȣ",201701982,"�İ�",1,17);
		Undergraduate u = new Undergraduate();
		u.setClub("ARGOS");
		System.out.println("�̸�:"+s.name+" �й�:"+s.number+" �Ҽ� �а�:"+s.depart+" �г�:"+s.grade+" �̼� ����:"+s.credit);
		
		Student t = new Student("ȣ����",200901982,"�İ�",4,10);
		Graduate g = new Graduate();
		g.setAssistant("���� ����");
		g.setMoney(0.7);
		System.out.println("�̸�:"+t.name+" �й�:"+t.number+" �Ҽ� �а�:"+t.depart+" �г�:"+t.grade+" �̼� ����:"+t.credit+" ���� ����: "+g.getAssistant()+" ���б� ����:"+g.getMoney());
	}
}
