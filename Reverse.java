package yoo;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Reverse r=new Reverse();
		r.setdata();
	}
	
	public void setdata()
	{
		String str;
		String st="";
		System.out.println("enter the letters");
		Scanner sc=new Scanner(System.in);
		str=sc.next();
		int length=str.length();
		for(int i=length-1;i>=0;i--)
		{
			st=st+str.charAt(i);
			System.out.println(st);
		}
		
	}

}
