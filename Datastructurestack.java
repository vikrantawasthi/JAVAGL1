package yoo;

import java.util.Stack;

public class Datastructurestack {

	public static void main(String[] args) {
		Stack<Object> s=new Stack<Object>();
		s.add(69);
		s.add(34);
		s.add(78);
		s.add(65);
		System.out.println("Stack : "+s);
		s.push(14);
		System.out.println("After push : "+s);   //////  AFTER PUSH
		
		System.out.println("Size of stack is : "+s.size()); 		/// SIZE
		
		
		for(int i=0;i<s.size();i++)
		{
			System.out.println(s);
		}
		
		System.out.println(s.pop()); 					//// POP 
		System.out.println(s.pop());

		
	}

}
