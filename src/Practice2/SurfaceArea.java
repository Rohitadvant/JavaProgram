package Practice2;

public class SurfaceArea {

	public static void main(String[] args) {
		int l=

	}

}

abstract class A{
	int length;
	int breadth;
	int height;
	public abstract void area();
}
 class B extends A{
int surfaceArea;
	@Override
	public void area() {
		surfaceArea=length*breadth*height;
		
	}
	 
 }