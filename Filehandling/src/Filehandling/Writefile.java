package Filehandling;

import java.io.FileWriter;

public class Writefile {

	public static void main(String[] args) {
		try  
		{
			FileWriter fw=new FileWriter("abc.txt");
			fw.write("VIKRANT IS HERE");
			fw.write("AWASTHI IS THE SURNAME");
			fw.write("YOYOYOYOYOY");
			fw.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("SUCESSS");
	}

}
