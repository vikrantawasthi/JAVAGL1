package yoo;

import java.util.Scanner;

class Main  											//// MAIN CLASS 
{
	String fname;
	String lname;
	int age;
	int poincode;
	Scanner sc=new Scanner(System.in);				////SCANNER FOR INPUTS
	void setdata()
	{
	System.out.println("enter the first name");
	fname=sc.next();
	System.out.println("enter the last name");
	lname=sc.next();
	System.out.println("enter the age name");
	age=sc.nextInt();
	System.out.println("enter the pincode name");
	poincode=sc.nextInt();
	
	
	}
	
	Main(String name, String lnam, int ag, int pincode)				////CONSTRUCTOR OF MAIN
	{
		this.fname=name;
		this.lname=lnam;
		this.age=ag;
		this.poincode=pincode;
		System.out.println("hello i am constructor of mainclass");
	}
	
}
public class Practice29 extends Main {							/// INHERITENCE
	
	Practice29(String name, String lnam, int ag, int pincode) {
		super(name, lnam, ag, pincode);
	}

	void getdata()											///NON STATIC METHOD
	{
		System.out.println(super.fname);
		System.out.println(super.lname);					///SUPER KEYWORD USED
		System.out.println(super.age);
		System.out.println(super.poincode);
		super.setdata();
		
	}

	public static void main(String[] args) {
		Practice29 p=new Practice29("heeta", "raina", 20, 110075);	///OBJECT CREATION
		p.getdata();		
	}

}
