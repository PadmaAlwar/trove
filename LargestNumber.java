package JavaPrograms;
import java.util.*;
import java.lang.*;
import java.io.*;
public class LargestNumber {
	public static void main(String[] args) {
	 int n1,n2,n3;
     Scanner obj=new Scanner(System.in);
	 System.out.println("Enter 3 numbers:-");
	 n1=obj.nextInt();
	 n2=obj.nextInt();
	 n3=obj.nextInt();
	 int large;
	 large=n1;
	 if(n2>large)
	 {
		 large=n2;
	 }
	 if(n3>large)
	 {
		 large=n3;
	 }
	 System.out.println("largest number entered is :"+large);
	}
}
