package yoo;

abstract class Banko 				////ABSTRACT CLASS
{
	public void display(int a)  		///NON STATIC METHID
	{
		System.out.println(a);
	}
	 public abstract void currentbalance();		/// ABSTRACT METHGOD
	 
	 int a=11100;
}

public class Class30 extends Banko {			///INHERTINCE

	public static void main(String[] args) {
		Banko b=new Class30();  			//// ABSTACTION
		b.currentbalance();
		b.display(99);

	}

	@Override
	public void currentbalance() {

		System.out.println(a+":balnce in saving account is");
	}

}
