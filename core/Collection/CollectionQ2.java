import java.util.HashSet;

public class CollectionQ2 {
	public static void main(String[] args)
	{
		HashSet<String> hs=new HashSet<>();
		hs.add("Poonguzhali");
		hs.add("Pavala");
		hs.add("Ashok");
		hs.add("Rita");
		hs.add("Alagarasan");
		
		System.out.println("Original");
		System.out.println(hs);
		System.out.println(hs.size());
		
		hs.add("Poo");
		hs.add("asha");
		
		System.out.println("After adding duplicate elements");
		System.out.println(hs);
		System.out.println(hs.size());
	}

}