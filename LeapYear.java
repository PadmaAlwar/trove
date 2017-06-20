package JavaPrograms;
import java.util.*;
import java.lang.*;
import java.io.*;
public class LeapYear {
	public static void main(String[] args) {
		int year;
		Scanner obj=new Scanner(System.in);
	    System.out.println("Enter a year:");
	    year=obj.nextInt();
	    if(year%4==0)
	    {
	    	System.out.println(year +"  is a leap year");
	    }
	    else
	    {
	    	System.out.println(year +"  is not a leap year");
	    }
	    
	}
}
