
public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,2,5,7,8,9,5,3,6};
	int countOdd=0; int countEven=0;
	for(int a:arr) {
		if(a%2==0) {
			countEven++;
		}else {
			countOdd++;
		}
	
	}System.out.println("Even Count= "+countEven+" Odd Count= "+countOdd);
	}
}
