package yoo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Arraylistaddall {

	public static void main(String[] args) {
		ArrayList<String>colors=new ArrayList<String>();
		
		colors.add("White");
		colors.add("Orange");
		colors.add("Red");
		colors.add("Indigo");
		System.out.println("array list before addall::"+ colors);

		Collections.sort(colors);  						///////////// SORTING OF AARAY LIST
		System.out.println("THE SORTING OF AARAY LIST"+colors);
		
		Collections.reverseOrder();
		System.out.println("THE RESVERSE ORDER IS : " +colors);
		
		ArrayList<String>countries=new ArrayList<String>();
		countries.add("India");
		countries.add("Spain");
		countries.add("Germany");
		countries.add("Norway");
		System.out.println("the countries before adall::"+countries);
		
		colors.addAll(countries);
		System.out.println(colors);
		
	}

}
