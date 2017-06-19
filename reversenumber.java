package reversenumber;

public class reversenumber {
	public static void main(String[]args){
		int num=1234;
		int reverse=0;
		System.out.println("enter the number");
		while(num!=0){
			reverse=reverse *10;
			reverse=reverse+num%10;
			num=num/10;
			System.out.println("the reverse number is:"+reverse);
			
			
		}
		
	}

}
