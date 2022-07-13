package yoo;

import java.util.Scanner;

public class Assighmentq1 {
	
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		double a;
		double b;
		String opertor;
		while(true)
		{
			System.out.println("enter the first number");
			a=sc.nextDouble();
			System.out.println("enter the second number");
			b=sc.nextDouble();
			System.out.println("enter the operator +,-,*,/");
			opertor=sc.next();
			
			if(opertor.equals("+")) 
			{
				System.out.println("addition of number is"+(a+b));
			}
			
			else if(opertor.equals("-"))
			{
				System.out.println("subtraction of number is"+(a-b));
			}
			
			else if(opertor.equals("*"))
			{
				System.out.println("multiplication of number is"+(a*b));
			}
			
			else if(opertor.equals("/"))
			{
				System.out.println("division of number is"+(a/b));
			}

		}
	}

}
