
public class PersonTest {
	public static void main(String[] args) {
		Customer c = new Customer();
		c.setName("�賲ȣ");
		c.setAddress("����� 8��");
		c.setPhone("010-7122-4540");
		c.setNumber(1);
		c.setMileage(100);
		System.out.println("�̸�: "+c.getName()+" �ּ�: "+c.getAddress()+" ��ȭ��ȣ: "+c.getPhone());
		System.out.println("��ȣ: "+c.getNumber()+" ���ϸ���: "+c.getMileage());
	}
}