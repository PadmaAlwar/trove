package JavaPrograms;
import java.util.*;
import java.lang.*;
import java.io.*;
public class CamelCase {
	 public static void main(String ags[]){
		 Scanner obj=new Scanner(System.in);
		 int result;
		 String t,s1;
		 t=obj.nextLine();
		 StringTokenizer s=new StringTokenizer(t," "); 
	     StringBuilder b=new StringBuilder();
		 while(s.hasMoreTokens())
	     {
			 s1=s.nextToken();
	    	 b.append(s1.substring(0, 1).toUpperCase());
	    	 b.append(s1.substring(1).toLowerCase());
	    	 b.append(" ");
	     }
		 System.out.print(b);
	 }
}
