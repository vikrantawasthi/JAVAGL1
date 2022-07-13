package Collection;

import java.util.TreeMap;

public class Treemap {

	public static void main(String[] args) {
		TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
		tm.put(100,"MESSI"); 									//// FOR ADDING ELEMNTS 
		tm.put(101,"RONALDO");
		tm.put(102,"KAKA");
		tm.put(103,"MBPAPE");
		System.out.println("THE PLAYERS NAMES ARE : "+tm);
		System.out.println("THE FIRST ELEMENT OF TREE SET IS : "+tm.get(100));
		System.out.println("THE SECOND ELEMENT OF TREE SET IS : "+tm.get(101));
		System.out.println("THE THIRD ELEMENT OF TREE SET IS : "+tm.get(102));
		System.out.println("THE FOURTH ELEMENT OF TREE SET IS : "+tm.get(103));
		
		
		
		tm.size();													///// FINDING THE SIZE
		System.out.println("THE SIZE OF HASH MAP IS : "+tm);
		
		tm.replace(100, "VAN PERSIE");								//// HOW TO REPLACE
		System.out.println("THE REPLACE VALUE : "+tm);

		tm.put(104, "VIKRANT");
		System.out.println("THE PUT METHOD : "+tm);            		///// PUT METHOD
																		 
		
		System.out.println("THE DESENDING ORDER : "+tm.descendingMap()); 	///// Maintains descending order 
		
		//Returns key-value pairs whose keys are less than or equal to the specified key. 
		
	      System.out.println("headMap: "+tm.headMap(102,true));  
	      
	      //Returns key-value pairs whose keys are greater than or equal to the specified key. 
	      
	      System.out.println("tailMap: "+tm.tailMap(102,true));  
	      
	      //Returns key-value pairs exists in between the specified key.  
	      
	      System.out.println("subMap: "+tm.subMap(100, false, 102, true)); 
		
	}

}
