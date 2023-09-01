package Practice2;

public class DistinctLetters {

	public static void main(String[] args) {
		String s= "My name is rohit";
		String s2="";
		char[] c=s.toCharArray();
System.out.println(c);
for(char v:c) {
	if(s2.indexOf(v)==-1)
	System.out.println(s2);
}
	}

}
