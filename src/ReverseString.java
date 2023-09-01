
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="Java";
String s2 = "";
for(int i=s.length()-1;i>=0;i--) {
	char c=s.charAt(i);
	s2+=c;
}System.out.println(s2);
	}

}
