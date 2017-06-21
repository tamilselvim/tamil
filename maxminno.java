package maxminno;

public class maxminno {
	public static void main(String[]args){
		int[]array={1,2,3,4,5,6,7,8,9,10,23,45,6,790,87,13,24,45,34,56};
		int i=1;
		int maximum=array[0];
		int minimum=array[0];
		System.out.println("enter the 20 integers");
		for(i=1;i<array.length;i++){
			if(array[i]>maximum)
				maximum=array[i];
			else if(array[i]>minimum)
				minimum=array[i];
			
		}
		System.out.println("three maximum number is:"+maximum);
		System.out.println("three minimum number is:"+minimum);
		
	}
	
	
	

}
