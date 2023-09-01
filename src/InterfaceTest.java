
public class InterfaceTest {
public static void main(String[] args) {
		new Dog().sound();
		new Cat().sound();
	}
	}
 class Dog{
	public void sound()
	{
		System.out.println("Bhow Bhow");
	}
 }
 class Cat{
	 public void sound()
		{
			System.out.println("Meow Meow");
		}
 }
 interface Animal{
		public void sound();
	}