package yoo;

interface A
{
	public void a();
	
}

interface B 
{
 
	public void b();
}
public class Interfaceexample implements A,B {
	
	public void a()
	{
		System.out.println(" I AM A");
	}
	
	public void b()
	{
		System.out.println("I AM B");
	}

	public static void main(String[] args) {
		Interfaceexample i=new Interfaceexample();
		i.a();
		i.b();
	}

}
