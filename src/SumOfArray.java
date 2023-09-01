
public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int array []= {2,6,3,9,5,7};
System.out.println(Sum(array));
	}
public static int Sum(int arr[]) {
	int sum=0;
	for(int a:arr) {
		sum+=a;
	}
	return sum;
}
}
