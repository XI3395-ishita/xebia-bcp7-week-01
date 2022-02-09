import java.io.*;
public class poly {

	public static void main(String[] args) {
		System.out.print("Tomatoes ");
		veggies obj3=new veggies();
		obj3.type();
	}
}

class veggies{
	void type() {
		System.out.println("are rotten");
	}
}

class names extends veggies{
	void type() {
		System.out.println("are fresh");
	}
}
