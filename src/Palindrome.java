
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isPalindrome("12321"));
	}

static boolean isPalindrome(String s)
{
	int n=s.length();
for(int i=0;i<n/2;i++) {

	if(s.charAt(i)!=s.charAt(n-1-i)) {
		return false;
	}
}	return true;

}


}
