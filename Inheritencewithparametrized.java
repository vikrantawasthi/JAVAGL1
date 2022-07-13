package yoo;


class Studentdetail extends Inheritencewithparametrized
{
	/// DERIVED CLASS

	Studentdetail(String name, int age, String lname)
	
		///// CONSTRUCTOR
	{
		super(name, age, lname);
	}
	
}
public class Inheritencewithparametrized {
	/// MAIN CLASS
	String name="Vikrant";
	int age;
	String lname;
	
	Inheritencewithparametrized(String name,int age,String lname)
	// CONSTRUCTOR
	{
		this.name=name;
		this.age=age;
		this.lname=lname;
	}
	public static void main(String[] args) {
		
		Studentdetail s=new Studentdetail("Vikrant", 22, "awasthi");	/// Making  object 
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.lname);
		
	}

}
