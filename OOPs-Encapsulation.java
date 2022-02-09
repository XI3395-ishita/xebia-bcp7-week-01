import java.io.*;
class encap {

	private String name;
	private int age;
	private double salary;
	private int house_no;
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public Double getSalary() {
		return salary;
	}
	
	public int getHouseNo() {
		return house_no;
	}
	
	public void setName(String newName) {
		name=newName;
	}
	
	public void setAge(int newAge) {
		age=newAge;
	}
	
	public void setSalary(Double newSalary) {
		salary=newSalary;
	}
	
	public void setHouseNo(int newHouseNo) {
		house_no=newHouseNo;
	}
}

public class encapsulation{
	public static void main(String[] args) {
		encap obj9=new encap();
		
		
		obj9.setName("Arya");
		obj9.setAge(25);
		obj9.setSalary(2500.00);
		obj9.setHouseNo(83);
		System.out.println("Name: "+obj9.getName());
		System.out.println("Age: "+obj9.getAge());
		System.out.println("Salary: "+obj9.getSalary());
		System.out.println("House Number: "+obj9.getHouseNo());
		
	}
}



