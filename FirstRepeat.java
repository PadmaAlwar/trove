package JavaPrograms;
import java.util.*;
import java.lang.*;
import java.io.*;
public class FirstRepeat {

	public static void main(String ags[]){

	     Scanner obj=new Scanner(System.in);
	     System.out.println("Enter array size");
			int sz,i,j,flag=0;
			sz=obj.nextInt();
			int arr []=new int[sz];
			try
			{
				System.out.println("Enter integer array elements");
				for(i=0;i<sz;i++)
				{
					arr[i]=obj.nextInt();
				}
				 for(i=0;i<sz;i++)
				   {
					 for(j=i+1;j<sz-1;j++)
					   {
		                 if(arr[i]==arr[j])
		                 {
		                	 flag=1;
		                	 break;
		                 }
		                }
			        if(flag==1)
			        {
			        	System.out.println( arr[i] +" is the first repeat in array");
						    break;    	
			        }
	                }				
			}
			catch(InputMismatchException e)
			{
				System.out.println("Input should be an integer array");
			}
		}
	}


 
 
