package yoo;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterationoverlist {

	public static void main(String[] args) {
		
		List<String> l=new ArrayList<String>();
		l.add("MI");
		l.add("MOTO");
		l.add("ONEPLUS");
		l.add("nothing");
		
		 ListIterator lt=l.listIterator();
		 
		 System.out.println("TRAVERSING THE LIST IN FORWARD DIRECTION");
		 while(lt.hasNext()) 
		 {
			 System.out.println(lt.next());
			 
		 }
		 
		 System.out.println("TRAVERSING THE LIST THE BACKWARD DIRECTION");
		 while(lt.hasPrevious())
		 
		 {
			 System.out.println(lt.previous());
		 }
		 
	}

}
