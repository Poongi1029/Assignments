import java.util.*;
public class Hash_Map {
	public static void main(String[] args)
	{
		HashMap<Integer,Double> map=new HashMap<Integer,Double>();
		map.put(10, 10.00);
		map.put(20, 20.00);
		map.put(30, 30.00);
		map.put(40, 40.00);
		map.put(50, 50.00);
		map.put(60, 60.00);
		map.put(70, 70.00);
		map.put(80, 80.00);
		map.put(90, 90.00);
		map.put(100, 100.00);
		
		for(Map.Entry<Integer, Double> e: map.entrySet())
			System.out.println("Key sn: "+e.getKey()+" Value : "+e.getValue());
		
	}

}