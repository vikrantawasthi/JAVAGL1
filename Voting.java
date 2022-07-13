package yoo;
import java.util.*;

public class Voting {

	public static void main(String[] args) {
		
		Voting v=new Voting();
		v.setdata();
	}
	public void setdata()
	{
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("enter the age");
		a=sc.nextInt();
		if(a>18)
		{
			System.out.println("eligible for voting");
		}
		else
		{
			System.out.println("Not eliblbe for voting");
		}
		
	}

}
