package guvi;
import java.util.*;
public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		int temp,sum=0;
		temp=n;
		while(n!=0){
			int r=n%10;
			sum=sum*10+r;
			n=n/10;
		}
		if( temp==sum){
			System.out.println("palindrome");
			
		}
		else
			System.out.println("not a palindrome");

	}

}
