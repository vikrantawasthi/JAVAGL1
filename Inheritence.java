package yoo;

public class Inheritence {

	public static void main(String[] args) {

		Child c=new Child(  30  ,  "Vikrant"  , " Awasthi " ,  110075);
		System.out.println(""+c.name+ ""+c.lname+ ""  +c.age+  ""  +c.pincode+ "");
		c.setdata();
		
	}

}

 class Parent
 {
	 String name;
	 String lname;
	 int age;
	 int pincode;
	 
	 
	 public Parent(int age, String name,String lname,int pincode)
	 {
		 this.name=name;
		 this.age=age;
		 this.lname=lname;
		 this.pincode=pincode;
		 
	 }
	 
	 public void setdata()
	 {
		 System.out.println("this is parent class");
	 }
}

  class Child extends Parent{

	public Child(int age, String name,String lname,int pincode) {
		super(age, name,lname,pincode);
	}
	  
 }
 