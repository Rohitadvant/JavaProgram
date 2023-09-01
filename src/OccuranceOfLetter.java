
public class OccuranceOfLetter {

	public static void main(String[] args) {
		String s1="Developlerr";
		String s2="";
		char c;
		int n;
		for(int i=0;i<s1.length();i++) {
			c=s1.charAt(i);
			if(s2.indexOf(c)==-1) {
				s2+=c;
				
				n=getCount(s1, c);
				System.out.println(c+"="+n);
				
			}
		}System.out.println(s2);
	}
public static int getCount(String s, char c) {
	return s.length()-s.replace(c+" ","").length();
}
}
//String s="Java Developer";
//String s2="";
//char c;
//for(int i=0;i<s.length();i++) {
//	c=s.charAt(i);
//	
//	if(s2.indexOf(c)==-1)
//	{
//		s2+=c;
//	}
//}
//System.out.println(s2);
//	}


