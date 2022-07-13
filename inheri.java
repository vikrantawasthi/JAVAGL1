package yoo;

import java.util.Scanner;

public class inheri {

	public void setdata()                            /// Method
	{
			System.out.println("enter the age ");
			int age;
			Scanner sc=new Scanner(System.in);      // for the input
			age=sc.nextInt();
			if(age>1 && age<=10)
			{
				System.out.println("Its  a kid");
			}
			else if(age>=11 && age<=20)
			{
				System.out.println(" its a teenager");
			}
			else if(age>=21 && age<45)
			{
				System.out.println("its an adult");
			}
			else
			{
				System.out.println("Old age");
			}
		}
	
	public static void main(String[] args) {
		
		Yoo y=new Yoo();							/// object decleration
		y.setdata();
		System.out.println(y.code="finish here!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		
	}
	
}

class Yoo extends inheri{
	
	String code;
}
