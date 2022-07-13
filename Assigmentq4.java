package yoo;

class Person
{
	String name;
	
	Person()
	{
		
		System.out.println("I AM THE CONSTRUCTOR");
	}
}

class employee1 extends Person
{
	String empname;
	int joiningyear;
	double annsalary;
	String insnumber;
	
	employee1(String empname,
	int joiningyear,
	double annsalary,
	String insnumber)
	{
		this.empname=empname;
		this.joiningyear=joiningyear;
		this.annsalary=annsalary;
		this.insnumber=insnumber;
	}
	
	void setdata()
	{
		
		System.out.println("THE EMPLOYEE NAME IS "+empname);
		System.out.println("THE JOINING YEAR IS "+joiningyear);
		System.out.println("THE ANUNAL SALARY IS  " +annsalary);
		System.out.println("THE INSURANCE NUMBER  "  +insnumber);
	}
	
}
public class Assigmentq4 {

	public static void main(String[] args) {
		
		employee1 e=new employee1("VIKRANT", 2022, 100000, "hh7h");
		e.setdata();
		
	}

}
