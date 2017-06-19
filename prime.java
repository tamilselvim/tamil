package guvi;
import java.util.*;
public class prime{

	public static void main(String []args){
	    int k=0;
	    System.out.println("Prime numbers:");
		for(int i=10;i<=99;i++){
	    int a=i/2;
	    for(int j=2;j<=a;j++){
	    if(i%j==0){
	           k=1;		
	           break;
	    		}}
	   	if(k==0){
	   		System.out.print(i+" ");
	   	}
	   	k=0;
	   	}
		}
}


