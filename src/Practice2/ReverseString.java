package Practice2;

public class ReverseString {

	public static void main(String[] args) {
	String s="Java12test987python";
	String s1="";
	for(int i=s.length()-1;i>=0;i--) {
		char c=s.charAt(i);
		s1+=c;
		
	}
System.out.println(s1);
	}

}
