
public class OverLoadingTest {

	public static void main(String[] args) {
		
OverLoadingTest ot=new OverLoadingTest();
ot.A(0, 0);
ot.A(0);
ot.A(0.0);
	}
public void A(int i) {
	System.out.println("This is method A");
}
public void A(int j, int k) {
	System.out.println("This is method B");
}
public void A(double i) {
	System.out.println("This is method C");
}
}
