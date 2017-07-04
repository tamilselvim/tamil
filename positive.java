package guvi;
import java.util.*;
public class positive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner s=new Scanner(System.in);
		Scanner s1=new Scanner(System.in);


		System.out.println("enter the number");
		num=s.nextInt();
		num=s1.nextInt();
		int sum=0;
		if(num>0){
			System.out.println("positive number");
			
		}
		else if(num<0){
			System.out.println("negative number");
		}
		else {
			
			System.out.println("zero");
		}

	}

}
