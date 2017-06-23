package JavaPrograms;
import java.util.*;
import java.lang.*;
import java.io.*;

public class kdigit {
     	public static void main(String[] args)throws java.lang.Exception {
		int k,num,count=1;
		
		 Scanner obj=new Scanner(System.in);
           System.out.println("Enter a number:-");
		   num=obj.nextInt();
       try
       {
      int temp=num;
		   if(temp==0)
		   {
		   count=1;
		   }
		   while(temp>0)
		   {
		   temp=temp/10;
		   count++;
		   }
		   count=count-1;
		  int num1 []=new int[count];
		  int i=0;
		  while(num!=0)
		  {
			num1[i]=num%10;
			num=num/10;
			i++;
		  }
		  Arrays.sort(num1);
		   
		System.out.println("Enter k value:-");
		  k=obj.nextInt();
		  int a;
		  a=count-k;
		  for(int c=0;c<a;c++)
		  {
			  System.out.print(num1[c]);
		  }
      }
      catch(InputMismatchException e)
      {
       System.out.println("It should be an integer");
      }
		  
    }   
}
