package homework;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee ET = new Employee();
		ET.setName("�賲ȣ");
		ET.setPhone("010-7122-4540");
		ET.setIncome(100);
		
		System.out.println("�̸���: "+ET.getName());
		System.out.println("��ȭ��ȣ��: "+ET.getPhone());
		System.out.println("������: "+ET.getIncome());
	}
}
