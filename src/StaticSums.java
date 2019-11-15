
public class StaticSums {
	
	public void print(int x, int y) {     //method 1//
		System.out.println(x + y);
	}
    public void print(int x, int y, int z) {   //method 2//
        System.out.println(x + y + z);
    }
    	
    public void print(double x, int y) {      //method 3//
    	System.out.println((int)x + y);
    }
    public void println(int x, double y) {    //method 4//
    	System.out.println(x +(int) y);
    }
}