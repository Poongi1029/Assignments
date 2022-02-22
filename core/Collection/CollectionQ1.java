import java.util.TreeMap;
import java.util.*;
public class CollectionQ1 {
	public static void main(String[] args)
	{
		TreeMap<Long,String> contact=new TreeMap<>();
		contact.put((long) 952489604, "Ashok");
		contact.put((long) 993355664, "Bala");
		contact.put((long) 989874853, "Poonguzhali");
		contact.put((long) 967775097, "Christy");
		System.out.println(contact.keySet());
		System.out.println(contact.values());
		System.out.println(contact);
	}
}