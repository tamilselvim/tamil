package lc1;
import java.io.*;
import java.util.*;
public class swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=20,c=30;
		a=a+b+c;
		b=(a-b-c);
		c=(a-b-c);
		a=(a-b-c);
		System.out.println("the swap is"+(a));
		System.out.println("the swap is"+(b));
		System.out.println("the swap is"+(c));


	}

}
