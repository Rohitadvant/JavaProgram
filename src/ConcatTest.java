
public class ConcatTest {

	public static void main(String[] args) {
		String s1="Om";
		String s2="Namaha";
		String s3="Shivaya";
		StringBuilder s=new StringBuilder();
		s=s.append(s1).append(s2).append(s3);
		System.out.println(s);
		String s4=s1.concat(s2+s3);
		System.out.println(s4);
	}

}
