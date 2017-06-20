package String;
import java.util.*;
public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=" ";
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string");
		str=s.nextLine();
		StringBuffer s1=new StringBuffer(str);
		StringBuffer s2=new StringBuffer(s1);
		s1.reverse();
		System.out.println("origional string"+str);
		System.out.println("rreverse string"+s1);
		if(String.valueOf(s1).compareTo (String.valueOf(s2))==0){
			System.out.println("s2 is palindrome"+s2);
			
		}
		else
			System.out.println("s2 is not a palindrome"+s2);
		
		

	}

}
