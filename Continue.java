package yoo;

public class Continue {

	public static void main(String[] args) {

		Continue c=new Continue();
		c.setdata();
	}

	public void setdata()
	{
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				break;
			}
			System.out.println(i);
		}
		
		for(int j=1;j<5;j++)
		{
			for(int v=1;v<5;v++)
			{
				if(j==2 && v==2)
				{
					break;
					
				}
				System.out.println(j+""+v);
			}
		}
	}
}
