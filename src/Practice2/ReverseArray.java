package Practice2;

public class ReverseArray {

	public static void main(String[] args) {
	int [] arr= {1,2,3,4,5,6,7,8,9,10};
	int arr1[]= {};
	for(int i=arr.length-1;i>=0;i--) {
		arr1=(int[]) arr[i];
		
	}
	System.out.println(arr1);
}
}