	// Bean / POJO(Plain Old Java Object)
package myspringapp;

public class Student {
	private String name, address;

	public Student()
	{
		
	}
	
	public Student(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + "]";
	}
	
	public void myInit()
	{
		System.out.println("Initializing Student Bean");
	}
	
	public void myDestroy()
	{
		System.out.println("Destroying Student Bean");
	}
	
}
