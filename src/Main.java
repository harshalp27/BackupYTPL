

class Base {
	 final int i;
	 Base(){
		 i=9;
	 }
	public void foo() { 
		
		System.out.println("Base das"); }
	
}

class Derived extends Base {
	public void foo() { System.out.println("Derived"); } 
}

public class Main {
	public static void main(String args[]) {
		OverrideTest ot = new OverrideTest();
		//ot.setX(1);
		Base b = new Derived();
		b.foo();
	}
} 
