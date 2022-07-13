package yoo;

public class Break {

	public static void main(String[] args) {
		
		Break b=new Break();
		b.setdata();
	}
	
	public void setdata()
	{
		for(int i=1;i<=10;i++)
		{
			if(i==3 || i==4 || i==5 )
			{
				continue;
			}
			System.out.println(i);
		}
	}

}
