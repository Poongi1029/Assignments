public class q3 
{
	public static void main(String args[])
		{
		String str1="Java String pool refers to collection of Strings which are stored in heap memory";
		String str1Lower=str1.toLowerCase();
		System.out.println(str1Lower);  
	    String str1Upper=str1.toUpperCase();  
	    System.out.println(str1Upper);   
		String str1String=str1.replace('a','$'); 
		System.out.println(str1String); 
		System.out.println(str1.contains("collection"));    
		String str2="java string pool refers to collection of strings which are stored in heap memory";
		System.out.println(str1.equals(str2));
		System.out.println(str1==str2);
		
			}
		}