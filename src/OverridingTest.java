
public class OverridingTest {

	public static void main(String[] args) {
	new A().test(0);
	new B().test(0);
	}

}
class A {
	void test(int i) {
		System.out.println("This is Class A method");
	}
}

class B{
	void test(int j) {
		System.out.println("This is Class B method");
	}
}