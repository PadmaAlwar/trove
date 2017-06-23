package JavaPrograms;
import java.util.*;
import java.lang.*;
import java.io.*;
public class NaturalNumberSum {
	public static void main(String[] args) {
		int sum=0;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter value of n:");
		int n=obj.nextInt();
		try
		{
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println("Sum:"+sum);
		}
		catch(InputMismatchException e)
		{
			System.out.println("Not a number");
		}
	}

}
