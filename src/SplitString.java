import java.sql.Array;
import java.util.ArrayList;

public class SplitString {

	public static void main(String[] args) {
		String s="java, Python, C++, Ruby";
		String[] arr=s.split(",");
		for(String a:arr) {
			System.out.println(a);
		}
	}

}
