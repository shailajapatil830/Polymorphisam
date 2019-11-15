
public class DynamicPolyMain {
	
	public static void main(String[] args) {
		
		// Dynamic Polymorphisam or methods overriding 
		DynamicPolyParent parent = new DynamicPolyParent();
		parent.move();
		parent.sleep();
		
		DynamicPolyChild child = new DynamicPolyChild();
		child.move();
		child.sleep();
		
		parent = child;
		parent.move();
		parent.sleep();
	}
}
