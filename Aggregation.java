package yoo;

class Address{
	
	int steetnum;
	int housenum;
	String areanum;
	String landmark;
	int pin;
	String city;
	
	Address(int streetnum,int housenum,String areanum,String landmark, int pin , String city)
	{
		this.steetnum=streetnum;
		this.housenum=housenum;
		this.areanum=areanum;
		this.landmark=landmark;
		this.pin=pin;
		this.city=city;
		
		
	}
}
public class Aggregation {
	
	int rollnum;
	String stuname;
	Address studentAddr;
	

	public static void main(String[] args) {
		
	}

}
