package yoo;
import java.util.*;

public class Number {

	public static void main(String[] args) {
		Number n=new Number();
		n.setdata();
	}
	public void setdata()
	{
		System.out.println("enter the a number ");
		int a,b;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		System.out.println("enter the b number ");
		b=sc.nextInt();
		if(a==b)
		{
			System.out.println("enter number a and b is equal");
		}
		else
		{
			System.out.println("enter number are not equal");
		}
	}

}
