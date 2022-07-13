package yoo;
class Biko
{
	 void setdata1(int a)
	{
		System.out.println(a);
	}
	
	 void setdata1(int b, int c)
	{
		System.out.println(b+" "+c);
	}
	
	 void setdata(int a ,char e)
	{
		System.out.println(a+"jjb"+e);
	}
}
public class Overloadingmethod {

	public static void main(String[] args) {
		Biko v=new Biko();
		v.setdata1(2);
		v.setdata1(33, 22);
		v.setdata(99, 'i');

	}

}
