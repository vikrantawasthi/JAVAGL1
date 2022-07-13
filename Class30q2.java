package yoo;

abstract class Bank1			////ABSTRACT CLASS
{
	int a=440004;
	abstract void currentbalnce();   ///// ABSTRACT METHOD
}
public class Class30q2 extends Bank1 { 			///INHERITENCE

	public static void main(String[] args) {
		Bank1 b=new Class30q2();  		/// ABSTRACTION
		b.currentbalnce();
	}

	@Override
	void currentbalnce() {
		System.out.println("BALANCE IS:"+a);
	}

}
