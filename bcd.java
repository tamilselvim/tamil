package aaa;
import java.util.*;
public class bcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n;
		int sum=0;
		n=s.nextInt();
		for(int i=1;i<=n;i++){
			int r=n%10;
			sum=sum*10+r;
			n=n/10;
		}
		System.out.println(sum);


	}

}
