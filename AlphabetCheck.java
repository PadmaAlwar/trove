package JavaPrograms;
import java.util.*;
import java.lang.*;
import java.io.*;
 
public class AlphabetCheck {
	public static void main(String[] args) {
		char ch;
		 Scanner obj=new Scanner(System.in);
		 System.out.println("Enter a character:");
	     ch=obj.next().charAt(0);
	     if(Character.isLetter(ch))
	     {
	    	 System.out.println("Entered character '"+ch+"' is an alphabet");
	     }
	     else
	     {
	    	 System.out.println("Entered character  '"+ch+"' is not an alphabet ");
	    	 
	     }

	}
}
