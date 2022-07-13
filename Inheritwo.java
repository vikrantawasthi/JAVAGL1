package yoo;

import java.util.Scanner;

public class Inheritwo {
	

	Scanner sc=new Scanner(System.in);           //this for input
	int number1;								//intialization
	
	void setdata()								// method to enter the number
	{
		System.out.println("ENTER THE NUMBER YOU WANT TO ENTER");
		number1=sc.nextInt();
		
	}
	public static void main(String[] args) {
		Viko v=new Viko();						// Object decleration
		v.setdata();
		v.getdata();
		v.setodata();
		v.loaddata();
	}

}
class Subclass extends Inheritwo{
	
	public void getdata()					//method 
	{
		if(number1%2==0 )					/// checking if its a even  number
		{
			System.out.println("ITS a EVEN number");
		}
		else							///  checking if its a odd number
		{
			System.out.println("ITS A ODD number");
		}
	}
	
	public void setodata()				//method 
	{
		for(int i=1;i<=number1;i++)
		{
			if (i%2==0)
			{
				System.out.println(i+"Is even");
			}
			else
			{
				System.out.println(i+"is odd");
			}
		}
	}
}

 class Viko extends Subclass {								// Inhertience

	public void loaddata()                            /// Method
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
			else if(age>=21 && age<=45)
			{
				System.out.println("its an adult");
			}
			else
			{
				System.out.println("Old age");
			}
		}
 }
