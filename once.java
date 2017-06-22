package maxminno;
import java.util.*;
public class once {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r=0;
		int a[]={12, 1, 12, 3, 12, 1, 1, 2, 3, 2, 2, 3, 7};
		for(int i=0;i< a.length;i++)
		{
		r=a[i]|r%3;
		}
		System.out.println(r);
		}

	
	

}
