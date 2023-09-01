
public class LettersInString {

	public static void main(String[] args) {
findNumber("ruy6oij5j");	
	}
	static public void findNumber(String s) {
		char c = '0';
		for(int i=0;i<=s.length()-1;i++) {
			c=s.charAt(i);
			if(c>='0' != c<='9') {
			System.out.println(c);
			}
		}
	}
}

