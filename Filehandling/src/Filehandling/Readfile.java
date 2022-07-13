package Filehandling;

import java.io.FileWriter;
import java.util.Scanner;

public class Readfile {

	public static void main(String[] args) {
		try {
			FileWriter fwrite=new FileWriter("vikoo.txt");
			Scanner sc=new Scanner(System.in);
			String input=sc.nextLine();
			
			System.out.println("DATA ");
			fwrite.write(input);
			fwrite.close();
		}
		catch(Exception obj) {
			obj.printStackTrace();
		}
	}

}
