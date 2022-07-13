package yoo;

import java.util.Scanner;

public class Cartwo {

	String colour;
	String brand;
	int mfg ;
	int model;
	Scanner sc=new Scanner(System.in);
	
	public Cartwo()
	{
		this.colour="BLUE";
		this.brand="TESLA";
		this.mfg=2018;
		this.model=3484;
	}
	
	public void setdata()
	{
		String name;
		int age;
		System.out.println("Enter the customer Name");
		name=sc.next();
		System.out.println("enter the customer age");
		age=sc.nextInt();
	}
	public static void main(String[] args) {
		
		Cartwo c=new Cartwo();
		c.setdata();
		System.out.println("THE CAR COLOUR CUSTOMER BOUGHT IS " +c.colour+ "   THE CAR THAT BOUGHT "+c.brand+"   THE MANUFACTURING IS "+c.mfg+"  AND The MODEL is " +c.model);
		System.out.println(c.brand);
		
	}

}
