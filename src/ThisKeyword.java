
public class ThisKeyword {

	public static void main(String[] args) {
		ThisKeyword k=new ThisKeyword();
		k.i=10;
		k.display();		
	}
	
	int i;
void display() {
	int i;
		System.out.println(this.i);
	}
}

