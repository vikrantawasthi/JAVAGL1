package Exceptionhandling;

public class Practice {

	public static void main(String[] args) {
		try 
		{
			int a=100 ,b=0 ,c;
			c=a/b;
		}
		
		catch(Exception e)
		{
			//System.out.println("THE EXCEPTION IS : "+e);
			e.printStackTrace();
		}
		
		System.out.println("YOYOYOYOYOYOY");
	}

}
