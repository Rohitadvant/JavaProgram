
public class SuperKeyword {
	int i=10;
	void m1() {
		System.out.println("This is parent class method");
	}
	public static void main(String[] args) {
new Test33().m1();
	}	
}
class Test33 extends SuperKeyword{
	int i=5;
	void m1(){
		super.m1();
		System.out.println(super.i);
	}
}
