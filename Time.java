package JavaPrograms;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Time {
	 public static void main(String ags[]){
	 Scanner obj=new Scanner(System.in);
	 int result;
	 String t1,t2;
	 t1=obj.nextLine();
	 t2=obj.nextLine();
	 StringTokenizer a=new StringTokenizer(t1,":");
	 StringTokenizer b=new StringTokenizer(t2,":");
	 String hr,hr1,min,min1;
	 hr=a.nextToken();
	 min=a.nextToken();
	 hr1=b.nextToken();
	 min1=b.nextToken();
	 int hint=Integer.parseInt(hr);
	 int mint=Integer.parseInt(min);
	 int h1int=Integer.parseInt(hr1);
	 int m1int=Integer.parseInt(min1);
	 hint=hint*60;
	 h1int=h1int*60;
	 mint=mint+hint;
	 m1int=m1int+h1int;
	 if(mint>m1int)
	   result=mint-m1int;
	 else
	   result=m1int-mint;
	 System.out.print(result+"mins");
	 }
}
