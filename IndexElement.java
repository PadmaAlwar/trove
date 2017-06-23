package JavaPrograms;
import java.util.*;
import java.lang.*;
import java.io.*;
public class IndexElement {
	public static void sameindex (int[] arr1)
	{
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]==i)
			{
				System.out.println("Array index "+ i +"contain the element "+arr1[i]+ "  same as index");
			}
		}

	}
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
			sameindex(arr);
						
		}
		catch(InputMismatchException e)
		{
			System.out.println("Input should be an integer array");
		}
	}
}
