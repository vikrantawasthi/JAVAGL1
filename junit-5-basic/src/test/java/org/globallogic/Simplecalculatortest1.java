package org.globallogic;

import static org.junit.Assert.*;

import org.junit.Test;

public class Simplecalculatortest1 {
	
	@Test
	public void test() {
		
		Simplecalulator sc= new Simplecalulator();
		int actual=sc.add(2,2);
		int expected=4;
		assertEquals(expected,actual);
		System.out.println("ADDITION OF NUMBER");
		System.out.println(expected);
		
	}
	
	@Test
	public void test1() {
		
		Simplecalulator sc= new Simplecalulator();
		int actual=sc.subtract(2,2);
		int expected=0;
		assertEquals(expected,actual);
		System.out.println("SUBTRACTION OF NUMBER");
		System.out.println(expected);

	}
	
	@Test
	public void test2() {
		
		Simplecalulator sc= new Simplecalulator();
		int actual=sc.multiply(3,2);
		int expected=6;
		assertEquals(expected,actual);
		System.out.println("MULTIPLICATION OF NUMBER");
		System.out.println(expected);

	}
	
	@Test
	public void test3() {
		
		Simplecalulator sc= new Simplecalulator();
		int actual=sc.divide(2,2);
		int expected=1;
		assertEquals(expected,actual);
		System.out.println("DIVISION OF NUMBER");
		System.out.println(expected);

	}
	

}
