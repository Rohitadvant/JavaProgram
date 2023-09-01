package Practice2;

import java.util.HashMap;

public class OccuranceOfCharInString {

	public static void main(String[] args) {
		String s1="java is programming language";
		String s=s1.replace(" ", "");
		HashMap<Character, Integer> h=new HashMap<>();
		for(int i=s.length()-1;i>=0;i--) {
			if(h.containsKey(s.charAt(i))) {
				int count=h.get(s.charAt(i));
				h.put(s.charAt(i), ++count);
			}else {
				h.put(s.charAt(i), 1);
			}
		}
System.out.println(h);
	}
}
