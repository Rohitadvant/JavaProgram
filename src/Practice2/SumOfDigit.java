package Practice2;

public class SumOfDigit {

	public static void main(String[] args) {
	int a=981;
	int sum=0;
 while(a!=0) {
		int rem=a%10;
		sum=sum+rem;
		a=a/10;
	}
System.out.println(sum);
	}

}
