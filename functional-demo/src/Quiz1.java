class A extends B {
	void m1() {
		super.m1();
		System.out.println("child class");
	}
}

class B {
	void m1() {
		System.out.println("parent class");
	}
	
}

public class Quiz1 {
	public static void main(String[] args) {
		
	
	B a = new A();
	a.m1();
}
}
