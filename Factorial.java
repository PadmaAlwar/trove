package JavaPrograms;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Factorial {
	public static void main(String ags[]){
	int n,fact=1;
	Scanner obj=new Scanner(System.in);
	try
	{
	n=obj.nextInt();
	 
		for(int i=2;i<=n;i++)
		{
			fact=fact*i;
		}
	
	
	}
	catch(InputMismatchException e)
	{
		System.out.println("Not A Number");
	}
	{
		System.out.println(fact);
			
	}
	}
}
