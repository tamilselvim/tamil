package guvi;
import java.util.*;
public class least {

	public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

	         

	        System.out.println("Enter in a list of non-negative integers. End the list with a negative integer.");

	         
	        int n = 0, count = 0;

	        double largestInteger = 0, smallestInteger = 0, sum = 0;

	        for (int i = 1; n >= 0; i ++)

	        {

	            n = keyboard.nextInt();

	                if (n >= 0)

	                    {

	                    sum = sum + n;

	                    count = count + 1;

	                    }

	                if (n >= largestInteger)

	                    largestInteger = n;

	                if (i == 1);

	                    smallestInteger = n;

	                if (n >= 0 && n < smallestInteger)

	                    smallestInteger = n;

	        }  

	        System.out.println("The largest integer is: " + largestInteger);

	        System.out.println("The smallest integer is: " + smallestInteger);

	        System.out.println("The average of your list is: " + sum/count);

	    }

	 

	}



  
		