package yoo;

public class Parameterized {
	

	int empid;
	String empname;
	String emplname;
	String empdes;
	String loc;
	int pincode;
	
	public Parameterized(int empid,String empname ,String emplname,String empdes , String loc, int pincode)
	{
		
		this.empid=empid;
		this.empname=empname;
		this.emplname=emplname;
		this.empdes=empdes;
		this.loc=loc;
		this.pincode=pincode;
	}
	public static void main(String[] args) {
		    
		
		Parameterized p=new Parameterized(7576725, "Name:Vikrant", "LastName:Awasthi", "Postion:Trainee", "Location:Delhi", 110075);
		p.setdata();
	}
	
	public void setdata()
	
	//// NON STATIC CLASS METHOD
	
	{
		System.out.println("ID  "+empid+"   "+empname+"  "+emplname+"  "+empdes+"  "+loc+" Pincode: "+pincode);
	}

}
