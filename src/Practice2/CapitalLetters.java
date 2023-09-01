package Practice2;

public class CapitalLetters {

	public static void main(String[] args) {
		String s="AbCdefGHHH";
		int count = 0;
for(int i=0;i<s.length();i++) {
	if(s.charAt(i)>= 'A' && s.charAt(i) <= 'Z') {
		count++;
	}
}System.out.println(count);
	}

}
