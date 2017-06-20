package JavaPrograms;
import java.util.*;
import java.lang.*;
import java.io.*;
public class DigitCount {
	public static void main(String[] args) {
    int num,count=0;
		Scanner obj=new Scanner(System.in);
	   System.out.println("Enter a number:-");
	   num=obj.nextInt();
	   if(num<0)
	   {
	   num=num * -1;
	   }
	   else if(num==0)
	   {
	   count=1;
	   }
	   while(num>0)
	   {
	   num=num/10;
	   count++;
	   }
	     System.out.println(count);
}
}
