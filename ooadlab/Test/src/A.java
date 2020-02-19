
public class A {

	 void greet() {
		 	
		 System.out.println("A's greet");
		
	}
}

class B extends A  {
	void greet() {
		 System.out.println("B's greet");
	}
}

class Test{
	public static void main(String args[]) {
		A a = new B();
		
		a.greet();
	}
}