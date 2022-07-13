package yoo;
import java.util.*;

public class Fourth {

	public static void main(String[] args) {
		Fourth f=new Fourth();
		f.setdata();
	}
	
	public void setdata()
	{
		System.out.println("enter the age ");
		int age;
		Scanner sc=new Scanner(System.in);
		age=sc.nextInt();
		if(age>1 && age<10)
		{
			System.out.println("Its  a kid");
		}
		else if(age==11 && age<20)
		{
			System.out.println(" its a teenager");
		}
		else if(age>21 && age<45)
		{
			System.out.println("its an adult");
		}
		else
		{
			System.out.println("Old age");
		}
	}

}
