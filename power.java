package guvi;
import java.util.*;
public class power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int n=Integer.toString(a).length();
		int b[]=new int[n];
		int r,i=n-1,sum=1,c,d,s1=0,c1,d1,s2=0;
		while(a!=0){
			r=a%10;
			b[i]=r;
			i--;
			a=a/10;
		}
		for(int j=0;j<n;j++){
			if(j<n-1){
				c=b[j];
				d=b[j+1];
				sum=1;
				for(int k=0;k<d;k++){
					s1=s1*c;
				}
				s1=s1+sum;
			}
			if(j==n-1){
				c1=b[n-1];
				d1=b[0];
				s2=1;
				for(int q=0;q<d1;q++){
					s2=s2*c1;
				}
				s2=s1+s2;
			}
			System.out.println(s2);
		}
		

	}

}
