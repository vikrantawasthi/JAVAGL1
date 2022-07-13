package yoo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class Linkedlistcoll {

	public static void main(String[] args) {
		
		LinkedList<String> l=new LinkedList<String>();
		l.add("VIKRANT");									///// ADD METHOD
		l.add("AWASTHI");
		l.add("DWARKA");
		l.add("NEW DELHI");
		l.addFirst("JAVA");									///ADD FIRST 
		l.addLast("PROGRAMING");							/// ADD LAST

		System.out.println(l);
		
		LinkedList<String> l2=new LinkedList<String>();
		l2.add("new delhi");
		l2.add("agra");
		l2.add("kanpur");
		l2.add("dharamshala");
		System.out.println(l2);
		l2.addAll(l);									///////////////// ADD ALL METHOD
		System.out.println(l2);
		l2.addAll(1,l);										//////////// ADD ALL METHOD(INT INDEX , COLLECTION)
		System.out.println(l2);								 
		
		LinkedList<String> l3=new LinkedList<String>();
		l3 = (LinkedList) l.clone();                           /////////// CLONE METHOD
		System.out.println(l3);
		
		System.out.println(l3.contains("kanpur")); 				/////// 	CONTAINS METHOD
		
		System.out.println(l3.get(2)); 						/////  GET METHOD
		
		System.out.println(l3.getFirst()); 					///// GETFIRST METHOD
		
		System.out.println(l3.getLast());					////  GETLAST METHOD
		
		System.out.println(l3.size());						//// SIZE METHOD
		
		System.out.println(l3.indexOf("DWARKA")); 			//// INDEXOF METHOD
		
		l3.push("yoyooyyooyyooy"); 						///// PUSH METHOD
		System.out.println(l3);
		
		l3.pop();               						//// POP METHOD
		
		List<String> subl = l3.subList(1, 3); 			//////  SUB LIST METHOD
	      System.out.println("The SubList is: " + subl);
	      
	     Iterator itr =l3.iterator();
		 while(itr.hasNext())
		 {
			 System.out.println(itr.next());      ////// ITERATOR METHOD
			 
		 }
		 
		 System.out.println("First Element is : "
                 + l3.getFirst());
		 
		 System.out.println("First Element is : "
                 + l3.getLast());
	}

}
