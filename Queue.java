package yoo;

import java.util.Deque;
import java.util.LinkedList;

public class Queue {

	public static void main(String[] args) {

			 Deque<String> dq= new LinkedList<String>();
			 dq.add("VIKRANT");
			 dq.add("PROGRAMING");
			 dq.add("IS");
			 dq.add("FUN");
			 System.out.println("DEQUE:"+dq);
			 
			 dq.addFirst("NEW DELHI");
			 dq.addFirst("DWARKA");
			 
			 System.out.println("ADD FIRST:"+dq);
			 
			 
			 dq.addLast("YOYOYOY");
			 dq.addLast("HMMMM");
			 
			 System.out.println("ADD LAST :"+dq);
	}

}
