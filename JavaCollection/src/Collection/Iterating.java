package Collection;

import java.util.*;
import java.util.ListIterator;

public class Iterating {

	public static void main(String[] args) {
		  ListIterator<Integer>list=null;
		   List<Integer>arr=new ArrayList<>();
		   arr.add(7);
		   arr.add(2);
		   arr.add(3);
		   arr.add(5);
		 list=arr.listIterator();
		   while(list.hasPrevious()) {
			   
			   System.out.print(list.previous());
		   }
	}

}
