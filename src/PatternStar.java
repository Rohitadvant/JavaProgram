
public class PatternStar {

	public static void main(String[] args) throws InterruptedException {
		test4();
		}
	public static void test1() throws InterruptedException {
	for(int i=1;i<=5;i++) {
		for(int j=i;j<=5;j++) {
			System.out.print("*");
			Thread.sleep(500);
		}
		System.out.println();
	}
}
	public static void test2() throws InterruptedException {
		for(int i=1;i<=5;i++) {
		
			for(int j=5;j>i;j--) {
				System.out.print(" ");
			}
				for(int k=1;k<i*2;k++) {
				System.out.print("*");
				Thread.sleep(100);
			}
			System.out.println();
		}
	}
	public static void test3() throws InterruptedException {
		for(int i=1;i<=5;i++) {
		
			for(int j=1;j<=i;j++) {
				System.out.print("*");
				Thread.sleep(100);
			}
			System.out.println();
		}
	}
	public static void test4() throws InterruptedException {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if((i+j)%2==0) {
				System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
	

