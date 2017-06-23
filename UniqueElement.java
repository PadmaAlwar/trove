package JavaPrograms;
import java.util.*;
import java.lang.*;
import java.io.*;
public class UniqueElement {
	public static void main(String ags[]){
    
     Scanner obj=new Scanner(System.in);
     System.out.println("Enter array size");
		int sz,i,j,visited=0;
		sz=obj.nextInt();
		int arr []=new int[sz];
		try
		{
			System.out.println("Enter integer array elements");
			for(i=0;i<sz;i++)
			{
				arr[i]=obj.nextInt();
			}
			Arrays.sort(arr);
	         int r=0;
             for(i=0;i<sz;i++)
			   {
				 r=r^arr[i]; 
			   }
		System.out.println( r +" is an Unique Element of array");
				 
			
			
		}
		catch(InputMismatchException e)
		{
			System.out.println("Input should be an integer array");
		}
	}
}
