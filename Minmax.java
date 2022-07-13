package yoo;

public class Minmax {

	public static void main(String[] args) {
		
		Minmax m=new Minmax();
		m.setdata();
	}
	
	public void setdata()
	{
		int[] a= {4,3,5,2,1,6};
		int max=a[0];
		for(int i=1;i<a.length;i++)
		{
			if (max < a[i])
			{
				max=a[i];
			}
		} 
		System.out.println("max is"+max);
	}

}
