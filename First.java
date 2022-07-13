package yoo;

public class First {  
	
	public void setdata()
	{
		String str="Vikrant is here";
		System.out.println(str);
	}
	
	public void getdata()
	{
		int a=10;
		int b=20;
		int res=a+b;
		System.out.println(res);
		System.out.println("yoyoyo");
	}
	public static void main(String args[])  
	{    
		
		First f=new First();
		f.setdata();
		f.getdata();
	}
	}