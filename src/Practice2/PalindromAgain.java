package Practice2;

public class PalindromAgain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrom("MaM"));
	}
static boolean isPalindrom(String s) {
	int n=s.length()-1;
	for(int i=0;i<=n/2;i++) {
		if(s.charAt(i)!=s.charAt(n-i)) {
			return false;
		}
	}
	return true;
}
}
