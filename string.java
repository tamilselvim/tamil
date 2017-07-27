package tamil;
import java.util.*;
public class string {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str="";
		str=s.nextLine();
		String reverse=new StringBuffer(str).reverse().toString();
		System.out.println(reverse);

	}

}
