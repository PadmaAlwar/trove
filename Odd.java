package JavaPrograms;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Odd {
   	public static void main(String[] args)throws java.lang.Exception {
		int num,num1,a;
		 Scanner obj=new Scanner(System.in);
        
           System.out.println("Enter a min number:-");
		   num=obj.nextInt();
		   num1=obj.nextInt();
		   if(num%2==0)
			   a=num+1;
		   else
			   a=num; 
		   System.out.println("Odd number ");
		   for(int i=a;i<=num1;i=i+2)
		    {
			   if(!(a%2==0))
			   {
		           System.out.println(i);
		       }
		        
	        }
   	}   
}
