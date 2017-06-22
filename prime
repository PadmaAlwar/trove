package JavaPrograms;
import java.util.*;
import java.lang.*;
import java.io.*;

public class prime {
	 public static void main(String ags[]){
	 int min,i,j,flag=0,max,count=0;
	 Scanner obj=new Scanner(System.in);
	 min=obj.nextInt();
	 max=obj.nextInt();
	// System.out.print(1/2); 
	 for(i=min;i<=max;i++)
	 {
		 boolean prime=true;
		 for(j=2;j<i;j++)
		 {
			 if(i%j==0)
			 {
				 prime=false;
				  break;
			 }
			   
		   }
		if(prime)
		{
			if(i!=1)
			{
			count++;
			System.out.println(i);
			}
			}
	
	 }
	 System.out.println("Count:"+count); 
	 }
}
