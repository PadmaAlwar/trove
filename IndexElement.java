package JavaPrograms;
import java.util.*;
import java.lang.*;
import java.io.*;
public class IndexElement {
	public static void main(String ags[]){
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter array size");
		int sz;
		sz=obj.nextInt();
		int arr []=new int[sz];
		try
		{
			System.out.println("Enter integer array elements in increasing order");
			for(int i=0;i<sz;i++)
			{
				arr[i]=obj.nextInt();
			}
			for(int i=0;i<sz;i++)
			{
				if(arr[i]==i)
				{
					System.out.println("Array index "+ i +"contain the element "+arr[i]+ "  same as index");
				}
			}
			
		}
		catch(InputMismatchException e)
		{
			System.out.println("Input should be an integer array");
		}
	}
}
