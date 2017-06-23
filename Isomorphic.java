package JavaPrograms;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Isomorphic {
	public static void main(String ags[]){
		Scanner obj=new Scanner(System.in);
		 boolean isomorphic=true;
		 String t,t1;
		 t=obj.nextLine();
		 t1=obj.nextLine();
		 if(t1.isEmpty()||t.isEmpty())
		 {
			 isomorphic=false;
		 }
		 if(t1.length()!=t.length())
		 {
			 isomorphic=false;
		 }
		 HashMap<Character,Character> h=new HashMap <Character,Character>();
		 for(int i=0;i<t.length();i++)
		 {
			 char c=t.charAt(0);
			 char c1=t1.charAt(1);
			 if(h.containsKey(c))
			 {
				 if(h.get(c)!=c1)
				 {
					 isomorphic=false;
				 }
			 }
			 else
				 {
			            if(h.containsValue(c1))  
			                isomorphic= false;
			            h.put(c,c1);
			        }
			 
		 }
	 System.out.print(isomorphic);
	}
	
}
