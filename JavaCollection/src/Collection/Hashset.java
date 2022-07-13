package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {

	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		hs.add("ROHIT");
		hs.add("SHIKHAR");
		hs.add("VIRAT");
		hs.add("SKY");
		System.out.println("TOP FOUR : "+hs);
		
		Iterator<String> itr=hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}
		
		hs.size();
		System.out.println("SIZE OF HASH SET : "+hs);
		
		hs.remove("SHIKHAR");
		System.out.println("REMOVING SINGLE ELEMENT : "+hs);
		
		hs.removeAll(hs);
		System.out.println("REMOVING ALL ELEMET: "+hs);

	
	}

}
