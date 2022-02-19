import java.util.Scanner;

public class q1 {

    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            System.out.println("Enter Dividend number:");
            int dividend = scanner.nextInt();
            System.out.println("Enter Divisor number:");
            int divisor = scanner.nextInt();
            int result = dividend/divisor;
            System.out.println("Result is:"+result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        finally {
            if(scanner != null)
                scanner.close();
        }

    }

}