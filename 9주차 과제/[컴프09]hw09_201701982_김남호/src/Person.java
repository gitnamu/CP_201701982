
class Person {
	private String name, address, phone;
	
	public Person() {}
	
	public String getName() {		return name;	} 
	public void setName(String n) {		name = n;	}
	
	public String getAddress() {		return address;		}
	public void setAddress(String a) {		address = a;	}
	
	public String getPhone() {		return phone;		}
	public void setPhone(String p) {	phone = p;		}	
}
class Customer extends Person{
	private int number, mileage;
	
	public Customer() {}
	
	public int getNumber() {	return number;		}
	public void setNumber(int n) {		number = n;		}
	
	public int getMileage(){		return mileage;		}
	public void setMileage(int m) {		mileage = m;	}
	}

