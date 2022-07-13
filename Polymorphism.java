package yoo;

import java.util.Scanner;

class Army
{

	int amo;
	String gname;
	Scanner sc=new Scanner(System.in);
	void setdata()
	{
		System.out.println("THE AMO REQUIRED");
		amo=sc.nextInt();
		System.out.println("THE GUN YOU REQUIRED");
		gname=sc.next();
	}
}

class Navy extends Army
{
	
	String sub;
	String tor;
	void setdata()
	{
		System.out.println("THE SUBMARINE ");
		sub=sc.next();
		System.out.println("THE TORPIDOS REQUIRED ");
		tor=sc.next();

	}

}

class Airforce extends Army{
	
	String air;
	String mis;
	void setdata()
	{
		System.out.println("THE AIRCAFT NEEDED ");
		air=sc.next();
		System.out.println("THE MISSILES NEEDED ");
		mis=sc.next();

	}
}
public class Polymorphism {

	public static void main(String[] args) {
		Army a=new Army();
		Army ar=new Navy();
		Army arm=new Airforce();
		a.setdata();
		ar.setdata();
		arm.setdata();
		
	}

}
