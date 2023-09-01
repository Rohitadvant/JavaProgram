
public class BiggerNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,4,2,8,3,5};
System.out.println(bigNum(a));
	}
public static int bigNum(int[]arr) {
	int big=0;
	for(int a:arr)
	{
	if (a>big){
		big=a;
	}
	}	return big;
}
}
