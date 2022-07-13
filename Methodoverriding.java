package yoo;


class Method
{
	void setdata()
	{
		System.out.println("hey i am methooo");
	}
}
public class Methodoverriding extends Method{
	
	void setdata()
	{
		System.out.println("yoyoyoyoyoooyoyo");
	}
	public static void main(String[] args) {
		Methodoverriding m=new Methodoverriding();
		m.setdata();
	}

}
