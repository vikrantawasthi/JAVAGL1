package Java8_features;
import java.lang.*;
interface Method{
	public void display();                        //static method reference
}

class Methodtwo{
	public static void print() {
		System.out.println("static reference");
	}
}
public class Java8_methodrefrence {
	
	
	public static void main(String args[]) {
		Thread obj=new Thread(Methodtwo::print);
		obj.start();
		
		
		
	}
  
}