package yoo;

public class Car {

	String colour;
	String brand;
	int model;
	int mfdyear;
	
	public Car()
	{
		
		this.colour="green";
		
		this.brand="honda";
		
		this.model=9868;

		this.mfdyear=2000;
	}
	public static void main(String[] args) {
		Car c=new Car();
		System.out.println("The colour of car is  "+c.colour+"  The brand is  "+c.brand+"  The model number is  "+c.model+"  The manufacturing is  "+c.mfdyear);



	}

}
