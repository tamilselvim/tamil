package tamill;
import java.util.*;
public class arrayy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[10];
		int r = 0;
		int c0 = 0, c1 = 0,c2=0,c3=0,c4=0,c5=0,c6=0,c7=0,c8=0,c9=0;
		Scanner s=new Scanner(System.in);
		for(int i=0;i<10;i++){
			a[i]=s.nextInt();
		}
		for(int i=0;i<10;i++){
        while(r!=0){
        	r=a[i]%10;
        	a[i]=a[i]/10;
        }
        if(r==0){
        	c0++;
        }
        else if(r==1){
        	c1++;
        }
        else if(r==2){
        	c2++;
        }
        else if(r==3){
        	c3++;
        }
        else if(r==4){
        	c4++;
        }
        else if(r==5){
        	c5++;
        }
        else if(r==6){
        	c6++;
        }
        else if(r==7){
        	c7++;
        }
        else if(r==8){
        	c8++;
        }
        else if(r==9){
        	c9++;
        }
        while(r==1){
        	
        }
        }

	}

}
