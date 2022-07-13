package yoo;


abstract class Animal30th 		////ABSTRACT CLASS
{

	abstract void wolf();		/// ABSTRACT METHOD
	public static void main(String[] args) {

		Animal30th a=new Dogo();		///ABSTACTION
		a.wolf();
	}

}

class Dogo extends Animal30th			//INHERTINCE
{

	@Override
	void wolf() {
		System.out.println("dog is here");
	}
	
	
}
