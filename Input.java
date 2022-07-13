package yoo;
import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		
		Input i=new Input();
		i.setdata();
		
	}
	
	public void setdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		int a=sc.nextInt();
		System.out.println("enter the second number");
		int b=sc.nextInt();
		int res=a+b;
		System.out.println("addition of number :("+a+","+b+")="+res);
		
	}

}
