import java.io.*;
public class inherit {

	public static void main(String[] args) {
		Students obj1=new Students();
		obj1.name();
		obj1.Green();
		
		obj1.name();
		obj1.Red();
		
	}

}

class Colors{
	void Red() {
		System.out.println("Red House");
	}
	
	void Blue() {
		System.out.println("Blue House");
	}
	
	void Green() {
		System.out.println("Green House");
	}
	
	void Yellow() {
		System.out.println("Yellow House");
	}
}


class Students extends Colors{
	void name() {
		System.out.print("Joe is in ");
	}
}
