package Filehandling;

import java.io.File;

public class Creatingnewfile {

	public static void main(String[] args) {
		File f=new File("abc.txt");
		System.out.println("WHEATHER THE FILE EXIST OR NOT : "+f.exists());
		try
		{
			f.createNewFile();
			System.out.println(f.exists());
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("THE SIZE OF FILE IS "+f.length());
		System.out.println("Getting file name :  "+f.getName());

	}

}
