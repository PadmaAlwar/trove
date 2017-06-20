
package JavaPrograms;
import java.util.*;
import java.lang.*;
import java.io.*;
public class NumberCheck {

	public static void main(String[] args) {
		int num;
		   Scanner obj=new Scanner(System.in);
		   System.out.println("Enter a number:");
		   num=obj.nextInt();
		   if(num>0)
		    {
		     System.out.println(num+"is a Positive number");
		     }
		   else if(num==0)
		    {
		      System.out.println(num+"is Zero");
		     }
		   else
		     {
		      System.out.println(num+"is a Negative number ");
		      }
	}

}
