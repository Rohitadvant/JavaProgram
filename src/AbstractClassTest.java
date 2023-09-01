
public class AbstractClassTest extends Test{

	public static void main(String[] args) {
		AbstractClassTest test=new AbstractClassTest();
		test.method1();
		test.test1();
	}

	@Override
 void method1() {
		
		System.out.println("This is abstract method");
	}
	void test1() {
		  System.out.println("This is override method");
	}

}
 abstract class Test {
	  abstract void method1();
	  void test1() {
		  System.out.println("This is normal method");
	  }
}