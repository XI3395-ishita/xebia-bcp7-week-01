import java.io.*;
abstract class abc{
	public abstract void Colors();
	public void Display() {
		System.out.println("Apple is red in color");
	}
}

class Fruits extends abc{
	public void Colors() {
		System.out.println("Mango is yellow in color");
	}
}

class abstraction{
	public static void main(String[] args) {
		Fruits obj6=new Fruits();
		obj6.Colors();
		obj6.Display();
	}
}
