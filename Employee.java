package yoo;

public class Employee {
	int id;
	String fname;
	String lname;
	String city;
	String state;
	
	public Employee(int id,String fname,String lname,String city,String state) 
	{
		this.id=id;
		this.fname=fname;
		this.lname=lname;
		this.city=city;
		this.state=state;
	}
	
	public static void main(String[] args) {
		
		Employee e=new Employee(7574725, "Vikrant", "awasthi", "Delhi", "India");
		System.out.println("The id is "+e.id+" First Name is "+e.fname+" The last name is " +e.lname+"  City is "+e.city+"  The state is" +e.state);
		
	}
}
