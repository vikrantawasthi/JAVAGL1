package yoo;

class Userdetails
{
	int userid;
	String username;
	String userlname;
	String usercity;
	
	Userdetails(int userid, String username, String userlname, String usercity)
	{
		
		this.userid=userid;
		this.username=username;
		this.userlname=userlname;
		this.usercity=usercity;
	}
}


class Employeedetail
{
	int empid;
	String empfname;
	String emplname;
	String empcity;
	String empstate;

	Employeedetail(int empid,
	String empfname,
	String emplname,
	String empcity,
	String empstate)
	{
		this.empid=empid;
		this.empfname=empfname;
		this.emplname=emplname;
		this.empcity=empcity;
		this.empstate=empstate;
		
	}
	
}

class Productdetail
{
	int pid;
	String pname;
	String pdescription;
	int pprice;
	
	Productdetail(int pid,
	String pname,
	String pdescription,
	int pprice)
	{
		this.pid=pid;
		this.pname=pname;
		this.pdescription=pdescription;
		this.pprice=pprice;
		
	}
}



public class Assigmentq3 {

	public static void main(String[] args) {
		Userdetails u=new Userdetails(1, "vikrant", "awasthi", "delhi");
		Employeedetail e=new Employeedetail(1, "ram", "sharma", "dwarka", "new delhi");
		Productdetail p=new Productdetail(33, "heeta", "airpods",2200 );
		System.out.println(  u.userid+"  "  +u.username+"  "+u.userlname+"   "+ u.usercity);
		System.out.println(e.empid+"  "  +e.empfname+"  "+e.emplname+"   "+ e.empcity+ "  "+e.empstate);
		System.out.println(p.pid+"  "  +p.pname+"  "+p.pdescription+ "  "+p.pprice);
		
		
	}

}
