package JavaPrograms;
import java.util.*;
import java.lang.*;
import java.io.*;

public class RomanConvert {
	public static void main(String ags[]){
     Scanner obj=new Scanner(System.in);
     int d=0;
	 String roman_num,roman_num_upper;
	 roman_num=obj.nextLine();
	 roman_num_upper=roman_num.toUpperCase();
	 for(int i = 0;i<roman_num.length();i++)
	    {
	        char first = roman_num_upper.charAt(i);

	        switch (first)
	        {
	        case 'M':
	            d =d+ 1000;
	            break;

	        case 'D':
	            d = d+ 500;
	            break;

	        case 'C':
	            d =d + 100;
	            break;

	        case 'L':
	            d=d + 50;
	            break;

	        case 'X':
	            d =d + 10;
	            break;

	        case 'V':
	            d=d + 5;
	            break;

	        case 'I':
	            d=d + 1;
	            break;
	        }
	    }
	    if (roman_num_upper.contains("IV"))
	    {
	        d=d-2;
	    }
	    if (roman_num_upper.contains("IX"))
	    {
	        d=d-2;
	    }
	    if (roman_num_upper.contains("XL"))
	    {
	        d=d-10;
	    }
	    if (roman_num_upper.contains("XC"))
	    {
	        d=d-10;
	    }
	    if (roman_num_upper.contains("CD"))
	    {
	        d=d-100;
	    }
	    if (roman_num_upper.contains("CM"))
	    {
	        d=d-100;
	    }
	    System.out.print(d);
	}
	
}
 
    
