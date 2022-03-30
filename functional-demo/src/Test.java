@FunctionalInterface
interface MyFunctionalInterface{
	void count();
}

class Impl1 implements MyFunctionalInterface{
	@Override
	public void count() {
		System.out.println("Called 1");
	}
}

public class Test {
   public static void main(String args[]) {
	   MyFunctionalInterface impl = () -> System.out.println("Called 2");
	   impl.count();
   }
}
