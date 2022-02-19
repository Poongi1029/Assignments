public class StringBuilderAssignment {
		public static void main(String[] args)
		 {
		 StringBuilder s = new StringBuilder("");
		 System.out.println(s);
		 s.append("StringBuilder");
		 s.append(" Is a peer class of String");
		 s.append(" That provides much of");
		 s.append(" the functionality of strings");
		 System.out.println(s);
		 StringBuilder str = new StringBuilder("it is used to at the specified index position");
	        System.out.println("string = " + str);
	        str.insert(14, "Insert text ");
	        System.out.println(str.toString());
	        StringBuilder sbr = new StringBuilder("this method returns the reversed object on which it was called");
	        System.out.println(sbr);
	        sbr.reverse();
	        System.out.println(sbr);
	    }


}
