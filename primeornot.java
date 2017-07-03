package tamil;
import java.io.*;
import java.util.*;

public class primeornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,i,count=0;
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		for(i=2;i<num;i++){
			if(num%i==0){
				count++;
				break;
			}
		}
		if(count==0){
			System.out.println("is a prime number");
		}
		else
			System.out.println("is not a prime number");
		

	}

}
