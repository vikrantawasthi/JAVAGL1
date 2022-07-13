package yoo;

abstract class Bank
{
	 public void display(int a)
	{
		
	}
	
	public abstract void currentbalance();
	int saving=11000;
	
static class Saving12 extends Bank
{

	@Override
	public void currentbalance() 
	{
		System.out.println(saving+"this much is the saving");
	}
	
public static void main(String[] args) {
	
	Bank b =new Saving12();
	b.currentbalance();
}
}

}
