
public class PersonTest {
	public static void main(String[] args) {
		Customer c = new Customer();
		c.setName("김남호");
		c.setAddress("기숙사 8동");
		c.setPhone("010-7122-4540");
		c.setNumber(1);
		c.setMileage(100);
		System.out.println("이름: "+c.getName()+" 주소: "+c.getAddress()+" 전화번호: "+c.getPhone());
		System.out.println("번호: "+c.getNumber()+" 마일리지: "+c.getMileage());
	}
}