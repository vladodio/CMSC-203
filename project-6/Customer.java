
public class Customer {
	private int age;
	private String name;
	
	public Customer(String name, int age) {
		this.setAge(age);
		this.setName(name);
	}
	
	public Customer(Customer c) {
		this.setAge(c.getAge());
		this.setName(c.getName());
	}
	
	public String toString() {
		String outstr = "Name: " + this.getName() + "\n";
		outstr += "Age: " + this.getAge() + "\n";
		return outstr;
	}
	
// getters and setters
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
