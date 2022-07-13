package yoo;

import java.util.Scanner;

public class Assigmentq2 {
	int a;
	int b;
	int c;
	int res;
	Scanner sc=new Scanner(System.in);
	
	void setdata()
	{
		System.out.println("enter the first number");
		a=sc.nextInt();
		System.out.println("enter the second number");
		b=sc.nextInt();
		System.out.println("enter the third number");
		c=sc.nextInt();
		System.out.println("The avergae of number are:"+( (a+b+c)/3) );
	}

	public static void main(String[] args) {
		

		Assigmentq2 assigmentq2=new Assigmentq2();
		assigmentq2.setdata();
	}

}
