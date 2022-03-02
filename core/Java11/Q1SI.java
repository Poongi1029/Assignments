package java11;

interface SimpleInterest {
	
	double SI(double P, double R, double T);

}

public class Q1SI {

    public static void main( String[] args ) {
    SimpleInterest ref;
    ref = (double P, double R, double T) -> {return (P*R*T)/100;};
    
    System.out.println("Simple Interest = " + ref.SI(100,15,3));
    } 
}