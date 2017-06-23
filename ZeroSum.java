package JavaPrograms;
import java.util.*;
import java.lang.*;
import java.io.*;
public class ZeroSum {
	public static void main(String ags[]){
		Scanner obj=new Scanner(System.in);
	     System.out.println("Enter array size");
			int sz,i,j,n1=0,n2=1;
			sz=obj.nextInt();
			int arr []=new int[sz];
			try
			{
				System.out.println("Enter integer array elements");
				for(i=0;i<sz;i++)
				{
					arr[i]=obj.nextInt();
				}
				int sum=arr[0]+arr[1],sum1;
				 for(i=0;i<sz-1;i++)
				   {
					 for(j=i+1;j<sz;j++)
					   {
						 sum1=arr[i]+arr[j];
		                  if(Math.abs(sum)>Math.abs(sum1))
		                  {
		                	  sum=sum1;
		                	  n1=i;
		                	  n2=j;
		                  }
		                }
		 				   }
				 System.out.println(" The two elements whose "+
                         "sum is closest to zero are "+
                   arr[n1]+ " and "+arr[n2]);
			}
			catch(InputMismatchException e)
			{
				System.out.println("Input should be an integer array");
			}
	}
}
