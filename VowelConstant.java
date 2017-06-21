package JavaPrograms;
import java.util.*;
import java.lang.*;
import java.io.*; 
 public class VowelConstant {
	 public static void main(String[] args) {
		 char ch;
		 Scanner obj=new Scanner(System.in);
		 System.out.println("Enter an alphabet:");
  	     ch=obj.next().charAt(0);
       	if(Character.isLetter(ch))
	     {
	     if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
	     {
	    	 System.out.println("Entered character"+ch+"is a vowel");
	     }
	     else
	     {
	    	 System.out.println("Entered character  '"+ch+"' is a consonant");
	    	 
	     }
	     }
	     else
	     {System.out.println(ch +"is not an alphabet");}
	 }
	  
}
