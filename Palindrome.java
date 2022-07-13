package yoo;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Palindrome p=new Palindrome();
		p.setdata();
	}
	
	public void setdata()
	{
		String str;
		System.out.println("enter the word");
		Scanner sc=new Scanner(System.in);
		str=sc.next();
		
	      StringBuffer buffer = new StringBuffer(str);
	      buffer.reverse();
	      String data = buffer.toString();
	      if(str.equals(data)){
	         System.out.println("Given String is palindrome");
	      } else {
	         System.out.println("Given String is not palindrome");
	      }
	}

}
