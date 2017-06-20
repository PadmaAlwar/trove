package JavaPrograms;
import java.util.*;
import java.lang.*;
import java.io.*;
 public class NumberSum {
		public static void main(String[] args) {
			int sum=0;
			Scanner obj=new Scanner(System.in);
			System.out.println("Enter value of n:");
			int n=obj.nextInt();
		    if(n>0)
				sum=n*(n+1)/2;
		    else
		    	sum=0;
			System.out.println("Sum:"+sum);
			
		}

}
