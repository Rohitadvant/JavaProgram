
public class DistinctLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="Java Developer";
String s2="";
char c;
for(int i=0;i<s.length();i++) {
	c=s.charAt(i);
	
	if(s2.indexOf(c)==-1)
	{
		s2+=c;
	}
}
System.out.println(s2);
	}

}
