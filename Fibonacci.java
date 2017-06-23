package JavaPrograms;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Fibonacci {
	public static void main(String[] args)throws java.lang.Exception {
	Scanner obj=new Scanner(System.in);
	System.out.print("Enter no of terms");
	int n,n1=0,n2=1,n3;
	
try
{
	n=obj.nextInt();
	System.out.print(n1+" "+n2);
	for(int a=2;a<n;a++)
	{
		n3=n1+n2;
		System.out.print(" "+n3);
		n1=n2;
		n2=n3;
	}
	
}
catch(InputMismatchException e)
{
	System.out.print("Input should be an integer");
	
	}
	}
}
