package Practice2;

public class DistinctChar {

	public static void main(String[] args) {
		String s="Java Developer";
		String s1="";
		char c;
		for(int i=0;i<s.length();i++) {
			c=s.charAt(i);
			if(s1.indexOf(c)==-1) {
				s1+=c;
				System.out.println(c);
			}
		}
		System.out.println(s1);
	}

}
