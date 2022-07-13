package Exceptionhandling;

public class Exceptionhandling {

	public static void main(String[] args) {
		try {
			int array[]=new int[7];
			array[0]=1;
			array[1]=2;
			array[2]=3;
			array[3]=4;
			array[4]=5;
			array[5]=6;
			array[6]=5;
			array[7]=45;
			
			for(int i=0;i<array.length;i++)
			{
				System.out.println(","+array[i]);
				System.out.println();
			}
			
			
		}
		finally
		{
			System.out.println("FINALLY BLOCK");
			System.out.println("MY NAME IS FINAALY, AND HI TO YOU ALL!!!!!!!");
		}
	}

}
