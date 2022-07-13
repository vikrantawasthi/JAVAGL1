package yoo;

abstract class Vikrant{
	
	abstract void setdata();
	
	void getdata()
	{
		System.out.println("I AM HERE");
	}
}
public class Abstractexample extends Vikrant {
	
	void setdata()
	{
		System.out.println("I AM ABSTRACT METHOD");
	}
	public static void main(String[] args) { 
		Abstractexample a=new Abstractexample();
		a.getdata();
		a.setdata();
		
	}
}
