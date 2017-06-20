package tamil;
import java.io.*;
import java.util.*;

public class prime10to99 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		int count=0;
		for(i=10;i<=99;i++){
			count=0;
			for(j=1;j<=i;j++){
				if(i%j==0)
				count++;
			}
		
		if(count==2){
			System.out.print(" "+i);
		}

	}}

}
