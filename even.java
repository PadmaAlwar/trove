package JavaPrograms;
import java.util.*;
import java.lang.*;
import java.io.*;

public class even {
     	public static void main(String[] args)throws java.lang.Exception {
		int num,num1,a;
		 Scanner obj=new Scanner(System.in);
        
           System.out.println("Enter a min number:-");
		   num=obj.nextInt();
		   num1=obj.nextInt();
		try
		{
		   if(num%2==0)
			   a=num;
		   else
			   a=num+1;
		   System.out.println("Even number ");
		   for(int i=a;i<=num1;i=i+2)
		    {
			   if(a%2==0)
			   {
		           System.out.println(i);
		       }
		        
	        }
   	}   
	catch(InputMismatchException e)
	{
	 System.out.println("Not a number")
	}
	}
}
