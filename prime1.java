package JavaPrograms;
import java.util.*;
import java.lang.*;
import java.io.*;

public class prime1 {
	 public static void main(String ags[]){
	 int i,j,flag=0,n,count=0;
	 Scanner obj=new Scanner(System.in);
	 n=obj.nextInt();
	for(i=2;i<=n/2;i++)
	  {
		  if(!(n%i==0))
			 {
       		System.out.println(n+"is a prime number");
			 }
       else
          System.out.println(n+"is not a prime number");
		}
	} 		
}
 
