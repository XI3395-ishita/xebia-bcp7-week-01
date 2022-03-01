package practice.oops.concepts;

abstract class employee{
	public abstract void nameOfEmployee();
	public abstract void ageOfEmployee();
}

class trainer extends employee{
	public void nameOfEmployee() {
		System.out.println("Name: Ashish Bansal");
	}
	
	public void ageOfEmployee() {
		System.out.println("Age: 25 years");
	}
}

class trainee extends employee{
	public void nameOfEmployee() {
		System.out.println("Name: Anurag Kumar");
	}
	
	public void ageOfEmployee() {
		System.out.println("Age: 27 years");
	}
}

public class newAbstarctionExample {
	public static void main(String[] args) {
		
		newAbstarctionExample obj2=new newAbstarctionExample();
		obj2.newAbstarctionExample();
		trainer obj=new trainer();
		obj.nameOfEmployee();
		obj.ageOfEmployee();
		
		trainee obj1=new trainee();
		obj1.nameOfEmployee();
		obj1.ageOfEmployee();
		
	
	}
	
	public static void newAbstarctionExample() {
		System.out.println("List of all employees:");
	}

}
