package homework;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee ET = new Employee();
		ET.setName("김남호");
		ET.setPhone("010-7122-4540");
		ET.setIncome(100);
		
		System.out.println("이름은: "+ET.getName());
		System.out.println("전화번호는: "+ET.getPhone());
		System.out.println("연봉은: "+ET.getIncome());
	}
}
