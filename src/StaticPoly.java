
public class StaticPoly {
	
	public void print() {
		System.out.println("Hello world!");
	}
	
	public void print(String name) {
		System.out.println("Hello " + name + "!");
	}
	
	public void print(String name, int age) {
		System.out.println("Hellow " + name + "!");
		if(age > 18) {
			System.out.println(" You can drive a car!");
		}
		else
		{
			System.out.println("Sorry you can't drive a car");
		}
	}

}
