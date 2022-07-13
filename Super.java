package yoo;

class Mainclass												////// MAIN CLASSSS
{
	String fname="VIKRANTTTTTTTTTTTTTTTT";
			void setdata() 									///NON STATIC METHOD
			{
				System.out.println("THIS IS MY MAIN CLASS BRUHHHHHHHHHHHHHHHH");
			}
}

class Baseclass extends Mainclass							///// SUBCLASSS
{
	String lname="AWASTHIIIIIIIIIIIIIIII";										//// NON STATIC METHOD
	
		//super.fname;
		//super.setdata();											/// SUPER KEYWORD USED
	
		void getdata() 										//// NON STATIC METHOD
		{
			System.out.println(super.fname);
			super.setdata();      							/// SUPER KEYWORD USED
		}
}


public class Super {

	public static void main(String[] args) { 			//// MAIN METHOD
		
		Baseclass b=new Baseclass(); 					///OBJECT CREATION
		b.getdata();
		System.out.println(b.lname);
	}

}
