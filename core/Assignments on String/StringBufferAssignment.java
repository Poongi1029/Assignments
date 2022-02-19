public class StringBufferAssignment 
{
	 public static void main(String[] args)
	 {
	 StringBuffer s = new StringBuffer("");
	 System.out.println(s);
	 s.append("StringBuffer");
	 s.append(" Is a peer class of String");
	 s.append(" That provides much of");
	 s.append(" The functionality of strings");
	 System.out.println(s);
	 StringBuffer str = new StringBuffer("It is used to at the specified index position");
        str.insert(14, "insert text ");
        System.out.println(str.toString());
        StringBuffer sbf = new StringBuffer("this method returns the reversed object on which it was called");
        System.out.println( sbf);
        sbf.reverse();
        System.out.println( sbf);
    }
	 }
